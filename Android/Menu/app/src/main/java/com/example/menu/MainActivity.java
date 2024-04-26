package com.example.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printLogs(View view) {
        TextView item1View = (TextView) findViewById(R.id.item1);
        String item1 = item1View.getText().toString();
        Log.v("MainActivity", item1);

        TextView item2View = (TextView) findViewById(R.id.item2);
        String item2 = item2View.getText().toString();
        Log.v("MainActivity", item2);

        TextView item3View = (TextView) findViewById(R.id.item3);
        String item3 = item3View.getText().toString();
        Log.v("MainActivity", item3);
    }
}
