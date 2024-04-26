package com.example.pets;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.pets.data.PetContract.PetEntry;
import com.example.pets.data.PetDbHelper;

public class CatalogAcitivity extends AppCompatActivity {

    private PetDbHelper petDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_acitivity);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CatalogAcitivity.this, EditorAcitivity.class);
                startActivity(intent);
            }
        });

        petDbHelper = new PetDbHelper(this);
        displayDatabaseInfo();
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayDatabaseInfo();
    }

    private void displayDatabaseInfo() {

        String[] projection = {
                PetEntry.NAME,
                PetEntry.BREED,
                PetEntry.GENDER,
                PetEntry.WEIGHT
        };

        Cursor cursor = getContentResolver().query(PetEntry.CONTENT_URI, projection,
                null, null, null);

        TextView displayView = (TextView) findViewById(R.id.textView);
        try {
            displayView.setText("The pets table conatains " + cursor.getCount() + " pets\n\n");
            displayView.append(PetEntry._ID + " - " + PetEntry.NAME + " - " + PetEntry.GENDER +
                    " - " + PetEntry.WEIGHT + "\n");

            int idIndex = cursor.getColumnIndex(PetEntry._ID);
            int nameIndex = cursor.getColumnIndex(PetEntry.NAME);
            int breedIndex = cursor.getColumnIndex(PetEntry.BREED);
            int genderIndex = cursor.getColumnIndex(PetEntry.GENDER);
            int weightIndex = cursor.getColumnIndex(PetEntry.WEIGHT);

            while(cursor.moveToNext()) {
                int currentID = cursor.getInt(idIndex);
                String currentName = cursor.getString(nameIndex);
                String currentBreed = cursor.getString(breedIndex);
                int currentGender = cursor.getInt(genderIndex);
                int currentWeight = cursor.getInt(weightIndex);
                displayView.append("\n" + currentID + " - " + currentName + " - " + currentBreed +
                        " - " + currentGender + " - " + currentWeight);
            }
        } finally {
            cursor.close();
        }
    }

    private void insertPet() {
        ContentValues values = new ContentValues();
        values.put(PetEntry.NAME, "Toto");
        values.put(PetEntry.BREED, "Terrier");
        values.put(PetEntry.GENDER, PetEntry.GENDER_MALE);
        values.put(PetEntry.WEIGHT, 7);

        Uri newUri = getContentResolver().insert(PetEntry.CONTENT_URI, values);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.insertDummyData:
                insertPet();
                displayDatabaseInfo();
                return true;
            case R.id.deleteAllPets:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
