package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;

import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Date;
import java.text.SimpleDateFormat;

public class EarthquakeAdapter extends ArrayAdapter<EarthquakeData> {

    public EarthquakeAdapter(Context context, ArrayList<EarthquakeData> earthquake) {
        super(context,0, earthquake);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        EarthquakeData data = getItem(position);

        TextView magnitude = (TextView) listView.findViewById(R.id.magnitude);
        DecimalFormat formatter = new DecimalFormat("0.0");
        String fomattedMagnitude = formatter.format(data.getMagnitude());
        magnitude.setText(fomattedMagnitude);
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();
        int magnitudeColor = getMagnitudeColor(data.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);

        String place = data.getPlace();
        String[] array = getLocation(place);

        TextView locationOffset = (TextView) listView.findViewById(R.id.locationOffset);
        locationOffset.setText(array[0]);

        TextView location = (TextView) listView.findViewById(R.id.location);
        location.setText(array[1]);

        Date dateObject = new Date(data.getTime());

        TextView date = (TextView) listView.findViewById(R.id.date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        String formattedDate = dateFormat.format(dateObject);
        date.setText(formattedDate);

        TextView time = (TextView) listView.findViewById(R.id.time);
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        String formattedTime = timeFormat.format(dateObject);
        time.setText(formattedTime);

        return listView;
    }

    protected String[] getLocation(String place) {
        String[] splitArray = new String[2];
        if(place.contains("of")) {
            splitArray = place.split("of");
            splitArray[0] += "of";
            splitArray[1] = splitArray[1].trim();
        }
        else {
            splitArray[0] = "Near the";
            splitArray[1] = place;
        }
        return splitArray;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
