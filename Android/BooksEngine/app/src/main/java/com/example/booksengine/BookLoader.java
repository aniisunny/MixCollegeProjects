package com.example.booksengine;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.util.List;

public class BookLoader extends AsyncTaskLoader<List<BookList>> {


    public  BookLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    private String url;

    @Override
    public List<BookList> loadInBackground() {
        Log.e("loadInBackground", "called");
        if(url == null)
            return null;
        List<BookList> books = BookUtils.fetchBookData(url);
        Log.e("booklist", books.toString());
        Log.e("loadInBackground", "returning");
        return books;
    }
}
