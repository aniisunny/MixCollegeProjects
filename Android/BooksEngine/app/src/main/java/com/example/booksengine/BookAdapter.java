package com.example.booksengine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<BookList> {

    public BookAdapter(Context context, List<BookList> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.book_view, parent, false);
        }

        BookList data = getItem(position);

        ImageView image = (ImageView) listView.findViewById(R.id.bookImage);
        //image.setImageResource(5);

        TextView author = (TextView) listView.findViewById(R.id.author);
        author.setText(data.author);

        TextView title = (TextView) listView.findViewById(R.id.title);
        title.setText(data.title);

        TextView language = (TextView) listView.findViewById(R.id.language);
        language.setText(data.language);

        TextView price = (TextView) listView.findViewById(R.id.price);
        double value = data.price * 0.054;
        price.setText(String.valueOf(value) + " PLN");

        return listView;
    }
}
