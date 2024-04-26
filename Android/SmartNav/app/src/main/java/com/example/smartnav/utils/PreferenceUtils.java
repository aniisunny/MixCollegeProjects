package com.example.smartnav.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtils {

    private static String KEY_EMAIL = "email";
    private static String KEY_PASSWORD = "password";
    private static String KEY_TOKEN = "token";
    private static String KEY_IMEINumber = "IMEINumber";

    public static boolean saveEmail(String email, Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putString(KEY_EMAIL, email);
        prefsEditor.apply();
        return true;
    }

    public static String getEmail(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(KEY_EMAIL, null);
    }

    public static boolean savePassword(String password, Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putString(KEY_PASSWORD, password);
        prefsEditor.apply();
        return true;
    }

    public static String getPassword(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(KEY_PASSWORD, null);
    }

    public static boolean saveToken(String token, Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putString(KEY_TOKEN, token);
        prefsEditor.apply();
        return true;
    }

    public static String getTokenNumber(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(KEY_TOKEN, null);
    }

    public static boolean saveIMEINumber(String IMEINumber, Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putString(KEY_IMEINumber, IMEINumber);
        prefsEditor.apply();
        return true;
    }

    public static String getIMEINumber(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(KEY_IMEINumber, null);
    }
}
