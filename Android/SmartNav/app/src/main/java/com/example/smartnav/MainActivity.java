package com.example.smartnav;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.smartnav.utils.PreferenceUtils;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo == null || !networkInfo.isConnected()) {
            String error = "Unable to connect with the server. Check your internet connection and try again.";
            builder.setMessage(error).setCancelable(false)
                    .setNegativeButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            startActivity(new Intent(MainActivity.this, MainActivity.class));
                        }
                    });
            AlertDialog alert = builder.create();
            alert.setTitle("Connection error");
            alert.show();
        }

        final TextView button = (TextView) findViewById(R.id.getting);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);
                /*if(PreferenceUtils.getEmail(MainActivity.this) != null
                        || !PreferenceUtils.getEmail(MainActivity.this).equals("")) {
                    Intent intent = new Intent(MainActivity.this, NavigationDrawer.class);
                    startActivity(intent);
                    finish();
                }
                else {*/
                    Intent intent = new Intent(MainActivity.this, SignUp.class);
                    startActivity(intent);
                    finish();
                }
            //}
        });

        TextView textView = (TextView) findViewById(R.id.in);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
            }
        });
    }
}
