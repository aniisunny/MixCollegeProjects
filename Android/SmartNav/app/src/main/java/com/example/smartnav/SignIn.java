package com.example.smartnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.smartnav.utils.PreferenceUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;
import java.util.Map;

public class SignIn extends AppCompatActivity {

    final private String url = "https://smartnav.000webhostapp.com/Signin.php";
    RequestQueue requestQueue;
    private AlertDialog.Builder builder;
    private ProgressBar progressBar;
    private Button button;
    private LinearLayout linearLayout;
    //protected String IMEINumber = "";
    //private TelephonyManager telephonyManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        builder = new AlertDialog.Builder(this);
        checkConnection();
        final EditText editText = (EditText) findViewById(R.id.email);
        final EditText password = (EditText) findViewById(R.id.pass);
        progressBar = (ProgressBar) findViewById(R.id.loadingIndicator);
        button = (Button) findViewById(R.id.login);
        linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        requestQueue = Volley.newRequestQueue(getApplicationContext());

        //telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        //IMEINumber = telephonyManager.getDeviceId();

        /*if(PreferenceUtils.getEmail(SignIn.this) != null
                || !PreferenceUtils.getEmail(SignIn.this).equals("")) {
            Intent intent = new Intent(SignIn.this, NavigationDrawer.class);
            startActivity(intent);
        }*/

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                checkConnection();
                progressBar.setVisibility(View.VISIBLE);
                button.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);

                final String emailPhone = editText.getText().toString();
                final String passwordString = password.getText().toString();

                StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                Log.e("SignIn response: ", response);
                                if(response.equals("Wrong Password")) {
                                    Toast.makeText(SignIn.this, "Wrong Password!",
                                            Toast.LENGTH_SHORT).show();
                                }
                                else if(response.equals("Unsuccessfully")) {
                                    Toast.makeText(SignIn.this, "User not found!",
                                            Toast.LENGTH_SHORT).show();
                                }
                                else if(response.equals("Connection Failed because ")) {
                                    Toast.makeText(SignIn.this, "Connection Lost!", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    isEmailVerified(emailPhone, passwordString, response);
                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("SignIn Error: ", "error");
                    }
                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> map = new HashMap<>();
                        map.put("Email", emailPhone);
                        map.put("Password", passwordString);
                        return map;
                    }
                };
                requestQueue.add(stringRequest);
            }
        });

        TextView forgotPassword = (TextView) findViewById(R.id.forgot);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView textView = (TextView) findViewById(R.id.up);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });

    }

    private void isEmailVerified(final String email, final String password, final String tokenNumber) {
        Toast.makeText(SignIn.this, "Welcome to our SmartNav family!", Toast.LENGTH_LONG).show();
        PreferenceUtils.saveEmail(email, SignIn.this);
        PreferenceUtils.savePassword(password, SignIn.this);
        PreferenceUtils.saveToken(tokenNumber, SignIn.this);
        Log.e("Matching: ", tokenNumber);
        Intent intent = new Intent(SignIn.this, NavigationDrawer.class);
        intent.putExtra("Token", tokenNumber);
        startActivity(intent);
        finish();
        Log.e("Email Finder: ", email);
        Log.e("Token Finder: ", tokenNumber);
    }

    private void checkConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo == null || !networkInfo.isConnected()) {
            String error = "Unable to connect with the server. Check your internet connection and try again.";
            builder.setMessage(error).setCancelable(false)
                    .setNegativeButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            startActivity(new Intent(SignIn.this, SignIn.class));
                        }
                    });
            AlertDialog alert = builder.create();
            alert.setTitle("Connection error");
            alert.show();
        }
    }

    private void visibility() {
        progressBar.setVisibility(View.GONE);
        button.setVisibility(View.VISIBLE);
        linearLayout.setVisibility(View.VISIBLE);
    }
}