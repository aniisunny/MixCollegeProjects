package com.example.didyoufeelit;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/1/" +
            "query?format=geojson&starttime=2019-01-01&endtime=2019-05-10&minfelt=50&minmagnitude=5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EarthquakeAsyncTask task = new EarthquakeAsyncTask();
        task.execute(USGS_REQUEST_URL);
    }

    private void updateUi(Event earthquake) {
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(earthquake.title);

        TextView magnitude = (TextView) findViewById(R.id.magnitude);
        magnitude.setText(earthquake.magnitude);

        TextView numberOfPeople = (TextView) findViewById(R.id.numberOfPeople);
        numberOfPeople.setText(earthquake.numberOfPeople + " people feel it");
    }

    private class EarthquakeAsyncTask extends AsyncTask<String, Void, Event> {

        @Override
        protected Event doInBackground(String... urls) {

            if(urls.length < 1 || urls[0] == null)
                return null;
            Event earthquake = Utils.fetchEarthquakeData(urls[0]);
            return earthquake;
        }

        @Override
        protected void onPostExecute(Event earthquake) {
            if(earthquake == null)
                return;
            updateUi(earthquake);
        }
    }
}
