package com.example.booksengine;

import android.app.LoaderManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderCallbacks<List<BookList>> {

    private Button button;
    private SearchView searchView;
    private BookAdapter adapter;
    private TextView emptyView;
    private static final int BOOK_LOADER_ID = 1;
    private static final String BOOK_REQUEST_URL = "https://www.googleapis.com/books/v1/volumes";
    Uri baseUri = Uri.parse(BOOK_REQUEST_URL);
    Uri.Builder builder = baseUri.buildUpon();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);
        adapter = new BookAdapter(this, new ArrayList<BookList>());
        listView.setAdapter(adapter);

        emptyView = (TextView) findViewById(R.id.emptyView);
        listView.setEmptyView(emptyView);

        button = (Button) findViewById(R.id.searchButton);
        searchView = (SearchView) findViewById(R.id.searchView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        builder.appendQueryParameter("q", query);
                        builder.appendQueryParameter("filter", "paid-ebooks");
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        builder.appendQueryParameter("q", newText);
                        builder.appendQueryParameter("filter", "paid-ebooks");
                        return false;
                    }
                });
            }
        });

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();
            loaderManager.initLoader(BOOK_LOADER_ID, null, this);
        } else {
            View loadingIndicator = findViewById(R.id.loadingIndicator);
            loadingIndicator.setVisibility(View.GONE);
            emptyView = (TextView) findViewById(R.id.emptyView);
            emptyView.setText("No internet connection.");
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BookList book = adapter.getItem(position);
                Uri website = Uri.parse(book.buyLink);
                Intent intent = new Intent(Intent.ACTION_VIEW, website);
                startActivity(intent);
            }
        });
    }

    @Override
    public Loader<List<BookList>> onCreateLoader(int id, Bundle bundle) {
        BookLoader bookLoader=new BookLoader(this, builder.toString());
        bookLoader.loadInBackground();
        return null;
    }

    @Override
    public void onLoadFinished(Loader<List<BookList>> loader, List<BookList> data) {
        View loadingIndicator = findViewById(R.id.loadingIndicator);
        loadingIndicator.setVisibility(View.GONE);
        emptyView.setText("No Books found.");
        adapter.clear();
        if (data != null)
            adapter.addAll(data);
    }

    @Override
    public void onLoaderReset(Loader<List<BookList>> loader) {
        adapter.clear();
    }
}
