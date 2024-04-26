package com.example.soonami;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

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
import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getName();
    private static final String USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/" +
            "1/query?format=geojson&starttime=2018-01-01&endtime=2018-12-01&minmagnitude=6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TsunamiAsyncTask task = new TsunamiAsyncTask();
        task.execute();
    }

    private void updateUi(Event earthquake) {
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(earthquake.title);

        TextView date = (TextView) findViewById(R.id.date);
        date.setText(getDateString(earthquake.time));

        TextView tSunamiAlert = (TextView) findViewById(R.id.tsunamiAlert);
        tSunamiAlert.setText(getTsunamiAlertString(earthquake.tsunamiAlert));
    }

    private String getDateString(long time) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy 'at' HH:mm:ss z");
        return formatter.format(time);
    }

    private String getTsunamiAlertString(int tsunamiAlert) {
        switch(tsunamiAlert) {
            case 0:
                return "No";
            case 1:
                return "Yes";
            default:
                return "Not Available";
        }
    }

    private class TsunamiAsyncTask extends AsyncTask<URL, Void, Event> {

        @Override
        protected Event doInBackground(URL... urls) {
            URL url = createUrl(USGS_REQUEST_URL);
            String jsonResponse = "";
            try {
                jsonResponse = makeHttpRequest(url);
            } catch (IOException e) {

            }

            Event earthquake = extractFeatureFromJson(jsonResponse);
            return earthquake;
        }

        @Override
        protected void onPostExecute(Event earthquake) {
            if(earthquake == null)
                return;
            updateUi(earthquake);
        }

        private URL createUrl(String stringUrl) {
            URL url = null;
            try {
                url = new URL(stringUrl);
            } catch (MalformedURLException exception) {
                return null;
            }
            return url;
        }

        private String makeHttpRequest(URL url) throws IOException {
            String jsonResponse = "";
            HttpURLConnection urlConnection = null;
            InputStream inputStream = null;

            if(url == null)
                return jsonResponse;

            try {
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.setReadTimeout(10000);
                urlConnection.setConnectTimeout(15000);
                urlConnection.connect();
                if(urlConnection.getResponseCode() == 200) {
                    inputStream = urlConnection.getInputStream();
                    jsonResponse = readFromStream(inputStream);
                }
                else
                    Log.e(LOG_TAG, "Error response code: " + urlConnection.getResponseCode());
            } catch (IOException e) {

            } finally {
                if(urlConnection != null) {
                    urlConnection.disconnect();
                }
                if(inputStream != null) {
                    inputStream.close();
                }
            }
            return jsonResponse;
        }

        private String readFromStream(InputStream inputStream) throws IOException {
            StringBuilder output = new StringBuilder();
            if(inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
                BufferedReader reader = new BufferedReader(inputStreamReader);
                String line = reader.readLine();
                while(line != null) {
                    output.append(line);
                    line = reader.readLine();
                }
            }
            return output.toString();
        }

        private Event extractFeatureFromJson(String jsonResponse) {
            try {
                JSONObject baseJsonResponse = new JSONObject(jsonResponse);
                JSONArray featureArray = baseJsonResponse.getJSONArray("features");

                if(featureArray.length() > 0) {
                    JSONObject firstFeature = featureArray.getJSONObject(0);
                    JSONObject properties = firstFeature.getJSONObject("properties");

                    String title = properties.getString("title");
                    long time = properties.getLong("time");
                    int tsunamiAlert = properties.getInt("tsunami");

                    return new Event(title, time, tsunamiAlert);
                }
            } catch (JSONException e) {

            }
            return null;
        }
    }
}
