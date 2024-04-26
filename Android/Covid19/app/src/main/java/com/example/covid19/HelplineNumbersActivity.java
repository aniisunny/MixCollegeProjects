package com.example.covid19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelplineNumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline_number);

        TextView number = (TextView) findViewById(R.id.number1);
        final String phoneNumber = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number2);
        final String phoneNumber2 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber2));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number3);
        final String phoneNumber3 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber3));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number4);
        final String phoneNumber4 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber4));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number5);
        final String phoneNumber5 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber5));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number6);
        final String phoneNumber6 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber6));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number7);
        final String phoneNumber7 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber7));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number8);
        final String phoneNumber8 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber8));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number9);
        final String phoneNumber9 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber9));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number10);
        final String phoneNumber10 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber10));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number11);
        final String phoneNumber11 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber11));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number12);
        final String phoneNumber12 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber12));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number13);
        final String phoneNumber13 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber13));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number14);
        final String phoneNumber14 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber14));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number15);
        final String phoneNumber15 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber15));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number16);
        final String phoneNumber16 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber16));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number17);
        final String phoneNumber17 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber17));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number18);
        final String phoneNumber18 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber18));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number19);
        final String phoneNumber19 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber19));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number20);
        final String phoneNumber20 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber20));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number21);
        final String phoneNumber21 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber21));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number22);
        final String phoneNumber22 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber22));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number23);
        final String phoneNumber23 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber23));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number24);
        final String phoneNumber24 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber24));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number25);
        final String phoneNumber25 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber25));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number26);
        final String phoneNumber26 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber26));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number27);
        final String phoneNumber27 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber27));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number28);
        final String phoneNumber28 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber28));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number29);
        final String phoneNumber29 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber29));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number30);
        final String phoneNumber31 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber31));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number32);
        final String phoneNumber32 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber32));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number33);
        final String phoneNumber33 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber33));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number34);
        final String phoneNumber34 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber34));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number35);
        final String phoneNumber35 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber35));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        number = (TextView) findViewById(R.id.number36);
        final String phoneNumber36 = number.getText().toString();
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + phoneNumber36));
                if(intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
                Toast.makeText(HelplineNumbersActivity.this, "Call Button Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
