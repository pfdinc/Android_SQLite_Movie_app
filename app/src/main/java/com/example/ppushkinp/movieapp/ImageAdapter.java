package com.example.ppushkinp.movieapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

//**
 /* Created by Pushkin Feleke on 11/6/17.
         */


public class ImageAdapter extends BaseAdapter
{
    private Context context;
    private final movie_instance[] movieValues;

    public ImageAdapter(Context context, movie_instance[] movieValues)
    {
        this.context = context;
        this.movieValues = movieValues;
    }

    public View getView(int position, View  convertView, ViewGroup parent)
    {
        LayoutInflater  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if(convertView == null)
        {
            gridView = new View(context);

            //get layout from movie_grid.xml
            gridView= inflater.inflate(R.layout.movie_grid, parent, false);

            //set image based on selected text

        }
        else
            gridView = (View) convertView;
        TextView textView = (TextView) gridView.findViewById(R.id.textView4);
        textView.setText(movieValues[position].id);
        ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView6);

        String movies = movieValues[position].name;

        if(movies.equals("heat"))
            imageView.setImageResource(R.drawable.heat);
        else if(movies.equals("jupiter"))
            imageView.setImageResource(R.drawable.jupiter);
        else if(movies.equals("melancholia"))
            imageView.setImageResource(R.drawable.melancholia);
        else if(movies.equals("zero"))
            imageView.setImageResource(R.drawable.zero);
        else
            imageView.setImageResource(R.drawable.zero);

        return gridView;
    }
    @Override
    public int getCount()
    {
        return movieValues.length;
    }
    @Override
    public Object getItem(int position)
    {
        return null;
    }
    @Override
    public long getItemId(int position)
    {
        return 0;
    }
}

