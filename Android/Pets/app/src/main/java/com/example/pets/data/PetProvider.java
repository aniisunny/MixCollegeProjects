package com.example.pets.data;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.Selection;

public class PetProvider extends ContentProvider {

    private PetDbHelper petDbHelper;
    private static final int PETS = 100;
    private static final int PETS_ID = 101;
    private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        uriMatcher.addURI(PetContract.CONTENT_AUTHORITY, PetContract.PATH_PETS, PETS);
        uriMatcher.addURI(PetContract.CONTENT_AUTHORITY, PetContract.PATH_PETS + "/#", PETS_ID);
    }

    @Override
    public boolean onCreate() {
        petDbHelper = new PetDbHelper(getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase database = petDbHelper.getReadableDatabase();
        Cursor cursor = null;
        int match = uriMatcher.match(uri);
        switch(match) {
            case PETS:
                break;
            case PETS_ID:
                selection = PetContract.PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};
                cursor = database.query(PetContract.PetEntry.TABLE_NAME, projection, selection,
                        selectionArgs, null, null, sortOrder);
                break;
                default:
                    throw new IllegalArgumentException("Cannot query unknown URI " + uri);
        }
        return cursor;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        final int match = uriMatcher.match(uri);

        String name = values.getAsString(PetContract.PetEntry.NAME);
        if(name == null)
            throw new IllegalArgumentException("Pet requires a name");

        Integer gender = values.getAsInteger(PetContract.PetEntry.GENDER);
        if(gender == null || !PetContract.PetEntry.isValidGender(gender))
            throw new IllegalArgumentException("Pet requires valid gender");

        Integer weight = values.getAsInteger(PetContract.PetEntry.WEIGHT);
        if(weight != null && weight < 0)
            throw new IllegalArgumentException("Pet requires a valid weight");

        switch(match) {
            case PETS:
                return insertPet(uri, values);
            default:
                throw new IllegalArgumentException("Insertion is not supported for " + uri);
        }
    }

    private Uri insertPet(Uri uri, ContentValues contentValues) {
        SQLiteDatabase database = petDbHelper.getWritableDatabase();
        long id = database.insert(PetContract.PetEntry.TABLE_NAME, null, contentValues);
        if(id == -1) {
            return null;
        }
        return ContentUris.withAppendedId(uri, id);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        final int match = uriMatcher.match(uri);
        switch(match) {
            case PETS:
                return updatePet(uri, values, selection, selectionArgs);
            case PETS_ID:
                selection = PetContract.PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};
                return updatePet(uri, values, selection, selectionArgs);
                default:
                    throw new IllegalArgumentException("Update is not supported for " + uri);
        }
    }

    private int updatePet(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        if(values.containsKey(PetContract.PetEntry.NAME)) {
            String name = values.getAsString(PetContract.PetEntry.NAME);
            if(name == null)
                throw new IllegalArgumentException("Pet requires a name");
        }

        if(values.containsKey(PetContract.PetEntry.GENDER)) {
            Integer gender = values.getAsInteger(PetContract.PetEntry.GENDER);
            if(gender == null || !PetContract.PetEntry.isValidGender(gender))
                throw new IllegalArgumentException("Pet requires valid gender");
        }

        if(values.containsKey(PetContract.PetEntry.WEIGHT)) {
            Integer weight = values.getAsInteger(PetContract.PetEntry.WEIGHT);
            if(weight != null && weight < 0)
                throw new IllegalArgumentException("Pet requires valid weight");
        }

        if(values.size() == 0)
            return 0;

        SQLiteDatabase database = petDbHelper.getWritableDatabase();
        return database.update(PetContract.PetEntry.TABLE_NAME, values, selection, selectionArgs);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        SQLiteDatabase database = petDbHelper.getWritableDatabase();
        final int match = uriMatcher.match(uri);
        switch (match) {
            case PETS:
                return database.delete(PetContract.PetEntry.TABLE_NAME, selection, selectionArgs);
            case PETS_ID:
                selection = PetContract.PetEntry._ID + "=?";
                selectionArgs = new String[] {String.valueOf(ContentUris.parseId(uri))};
                return database.delete(PetContract.PetEntry.TABLE_NAME, selection, selectionArgs);
                default:
                    throw new IllegalArgumentException("Deletion is not supported for " + uri);
        }
    }


    @Override
    public String getType(Uri uri) {
        final int match = uriMatcher.match(uri);
        switch(match) {
            case PETS:
                return PetContract.PetEntry.CONTENT_LIST_TYPE;
            case PETS_ID:
                return PetContract.PetEntry.CONTENT_ITEM_TYPE;
                default:
                    throw new IllegalArgumentException("Unknown URI " + uri + " with match " + match);
        }
    }
}
