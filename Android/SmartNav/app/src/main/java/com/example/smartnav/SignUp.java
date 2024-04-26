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

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button button;
    private LinearLayout linearLayout;
    private RequestQueue queue;
    private AlertDialog.Builder builder;
    private Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    private Pattern namePattern = Pattern.compile("[a-zA-Z ]+\\.?", Pattern.CASE_INSENSITIVE);
    final String url = "https://smartnav.000webhostapp.com/Signup.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        builder = new AlertDialog.Builder(this);
        checkConnection();
        progressBar = (ProgressBar) findViewById(R.id.loadingIndicator);
        linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        button = (Button) findViewById(R.id.register);
        final EditText name = (EditText) findViewById(R.id.fullname);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText phone = (EditText) findViewById(R.id.phone);
        final EditText pass = (EditText) findViewById(R.id.pass);
        final EditText confirm = (EditText) findViewById(R.id.confirm);
        final Button register = (Button) findViewById(R.id.register);
        queue = Volley.newRequestQueue(getApplicationContext());

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkConnection();
                progressBar.setVisibility(View.VISIBLE);
                button.setVisibility(View.GONE);
                linearLayout.setVisibility(View.GONE);

                final String nameString = name.getText().toString();
                final String emailString = email.getText().toString();
                final String number = phone.getText().toString();
                final String password = pass.getText().toString();
                String confirmPassword = confirm.getText().toString();
                Matcher passwordMatcher = passwordPattern.matcher(password);
                Matcher nameMatcher = namePattern.matcher(nameString);

                if(nameString == null || !nameMatcher.matches()) {
                    name.setError("Name is invalid");
                    name.requestFocus();
                    visibility();
                }
                else if(emailString == null || !emailString.contains("@") ||
                        !emailString.contains(".com") && !emailString.contains(".in")) {
                    email.setError("Email address is invalid");
                    email.requestFocus();
                    visibility();
                }
                else if(number.length() != 10) {
                    phone.setError("Phone number is invalid");
                    phone.requestFocus();
                    visibility();
                }
                else if(!passwordMatcher.matches()) {
                    String str = "At least 8 chars\n" +
                            "Contains at least one digit\n" +
                            "Contains at least one lower alpha char and one upper alpha char\n" +
                            "Contains at least one char within a set of special chars (@#$%^&+=)\n" +
                            "Does not contain space, tab, etc.";
                    builder.setMessage(str).setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert = builder.create();
                    alert.setTitle("Password Constraints");
                    alert.show();
                    visibility();
                }
                else if(!password.equals(confirmPassword)) {
                    confirm.setError("Password is not match");
                    confirm.requestFocus();
                    visibility();
                }
                else {
                    StringRequest request = new StringRequest(Request.Method.POST, url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    if(response.equals("Success")) {
                                        //emailVerification(emailString, password);
                                        Intent intent = new Intent(SignUp.this, SignIn.class);
                                        startActivity(intent);
                                        finish();
                                    }
                                    else {
                                        visibility();
                                        Toast.makeText(SignUp.this, response, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    visibility();
                                }
                            }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> map = new HashMap<>();
                            map.put("Name", nameString);
                            map.put("Email", emailString);
                            map.put("PhoneNumber", number);
                            map.put("Password", password);
                            return map;
                        }
                    };
                    queue.add(request);
                }
            }
        });

        TextView textView = (TextView) findViewById(R.id.in);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });
    }

    private void emailVerification(String email, String password) {

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
                            startActivity(new Intent(SignUp.this, SignIn.class));
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
