package com.example.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if the existing view is being resused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentrWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokTextView);
        miwokTextView.setText(currentrWord.getMiwokWord());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultTextView);
        defaultTextView.setText(currentrWord.getDefaultWord());

        ImageView imageResourceView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentrWord.hasImage()) {
            imageResourceView.setImageResource(currentrWord.getImageResouceId());
            imageResourceView.setVisibility(View.VISIBLE);
        }
        else {
            imageResourceView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
