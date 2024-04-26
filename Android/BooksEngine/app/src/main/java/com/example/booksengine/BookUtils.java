package com.example.booksengine;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


//Volley
//Retrofit

public class BookUtils {

    private static final String LOG_TAG = BookUtils.class.getName();

    public static List<BookList> fetchBookData(String BOOK_REQUEST_URL) {
        URL url = createUrl(BOOK_REQUEST_URL);
        String jsonResponse = "";
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the Http request", e);
        }
        List<BookList> books = extractFeatureFromJson(jsonResponse);
        return books;
    }

    private static URL createUrl(String BOOK_REQUEST_URL) {
        URL url = null;
        try {
            url = new URL(BOOK_REQUEST_URL);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Error in creating a url", e);
        }
        return url;
    }

    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        if(url == null)
            return jsonResponse;
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            if(urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            }
            else {
                Log.e(LOG_TAG, "Error response code: " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem retrieving the earthquake JSON results.", e);
        } finally {
            if(urlConnection != null)
                urlConnection.disconnect();
            if(inputStream != null)
                inputStream.close();
        }
        return jsonResponse;
    }

    private static String readFromStream(InputStream inputStream) throws IOException{
        StringBuilder output = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        while(line != null) {
            output.append(line);
            line = reader.readLine();
        }
        return output.toString();
    }

    private static List<BookList> extractFeatureFromJson(String jsonResponse) {
        List<BookList> books = new ArrayList<>();
        try {
            JSONObject baseJsonObject = new JSONObject(jsonResponse);
            JSONArray items = baseJsonObject.getJSONArray("items");
            for(int i = 0; i < items.length(); i++) {
                JSONObject firstItem = items.getJSONObject(i);
                JSONObject volumeInfo = firstItem.getJSONObject("volumeInfo");
                String title = volumeInfo.getString("title");
                JSONArray authors = volumeInfo.getJSONArray("authors");
                String author = authors.getString(0);
                JSONObject imageLinks = volumeInfo.getJSONObject("imageLinks");
                String image = imageLinks.getString("thumbnail");
                String language = volumeInfo.getString("language");
                JSONObject saleInfo = firstItem.getJSONObject("saleInfo");
                JSONObject retailPrice = saleInfo.getJSONObject("retailPrice");
                double price = retailPrice.getDouble("amount");
                String buyLink = saleInfo.getString("buyLink");
                books.add(new BookList(title, author, language, image, price, buyLink));
            }
        } catch (JSONException e) {
            Log.e("BookUtils", "Problem parsing the books Json results.", e);
        }
        return books;
    }
}
