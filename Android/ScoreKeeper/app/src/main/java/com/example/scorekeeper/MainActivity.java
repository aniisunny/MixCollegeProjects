package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulsForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayfoulsForTeamA(foulTeamA);
    }

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreTeamAView = (TextView) findViewById(R.id.pointsForTeamA);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }

    public void displayfoulsForTeamA(int foulTeamA) {
        TextView foulTeamAView = (TextView) findViewById(R.id.foulsForTeamA);
        foulTeamAView.setText(String.valueOf(foulTeamA));
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulsForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayfoulsForTeamB(foulTeamB);
    }

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreTeamAView = (TextView) findViewById(R.id.pointsForTeamB);
        scoreTeamAView.setText(String.valueOf(scoreTeamB));
    }

    public void displayfoulsForTeamB(int foulTeamB) {
        TextView foulTeamAView = (TextView) findViewById(R.id.foulsForTeamB);
        foulTeamAView.setText(String.valueOf(foulTeamB));
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayfoulsForTeamA(foulTeamA);
        displayfoulsForTeamB(foulTeamB);
    }
}
