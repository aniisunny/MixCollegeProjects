package com.example.covid19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button precautions = (Button) findViewById(R.id.precautions);
        precautions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrecautionsActivity.class);
                startActivity(intent);
            }
        });

        Button symptoms = (Button) findViewById(R.id.symptoms);
        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SymptomsActivity.class);
                startActivity(intent);
            }
        });

        Button helpline = (Button) findViewById(R.id.helpline_numbers);
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelplineNumbersActivity.class);
                startActivity(intent);
            }
        });

        Button myth = (Button) findViewById(R.id.myth_busters);
        myth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MythBustersActivity.class);
                startActivity(intent);
            }
        });

        Button fakeNews = (Button) findViewById(R.id.fake_news);
        fakeNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FakeViralNewsActivity.class);
                startActivity(intent);
            }
        });

        Button faq = (Button) findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });
    }
}
