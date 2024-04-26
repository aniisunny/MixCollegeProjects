package com.example.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookies(View view) {
        ImageView image = (ImageView) findViewById(R.id.cookies);
        image.setImageResource(R.drawable.after_cookie);
        TextView eat = (TextView) findViewById(R.id.hungry);
        eat.setText("I'm so full");
    }
}
