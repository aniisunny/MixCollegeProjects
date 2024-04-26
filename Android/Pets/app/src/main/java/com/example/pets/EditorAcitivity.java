package com.example.pets;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.pets.data.PetContract.PetEntry;
import com.example.pets.data.PetDbHelper;

public class EditorAcitivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText breedEditText;
    private Spinner genderSpinner;
    private EditText weightEditText;
    private int gender = PetEntry.GENDER_UNKNOWN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_acitivity);

        nameEditText = (EditText) findViewById(R.id.petName);
        breedEditText = (EditText) findViewById(R.id.breed);
        genderSpinner = (Spinner) findViewById(R.id.spinnerGender);
        weightEditText = (EditText) findViewById(R.id.weight);
        setupSpinner();
    }

    private void setupSpinner() {
        ArrayAdapter genderSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.gender_option, android.R.layout.simple_spinner_item);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        genderSpinner.setAdapter(genderSpinnerAdapter);

        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = (String) parent.getItemAtPosition(position);
                if(!TextUtils.isEmpty(selection)) {
                    if(selection.equals("Male"))
                        gender = PetEntry.GENDER_MALE;
                    else if(selection.equals("Female"))
                        gender = PetEntry.GENDER_FEMALE;
                    else
                        gender = PetEntry.GENDER_UNKNOWN;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gender = PetEntry.GENDER_UNKNOWN;
            }
        });
    }

    private void insertPet() {
        String name = nameEditText.getText().toString().trim();
        String breed = breedEditText.getText().toString().trim();
        int weight = Integer.parseInt(weightEditText.getText().toString().trim());

        ContentValues values = new ContentValues();
        values.put(PetEntry.NAME, name);
        values.put(PetEntry.BREED, breed);
        values.put(PetEntry.GENDER, gender);
        values.put(PetEntry.WEIGHT, weight);

        Uri newUri = getContentResolver().insert(PetEntry.CONTENT_URI, values);
        if(newUri == null)
            Toast.makeText(this, "Eroor with saving pet", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Pet saved", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.save:
                insertPet();
                finish();
                return true;
            case R.id.delete:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
