package com.codepath.flicksters.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.codepath.flicksters.R;
import com.codepath.flicksters.models.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Sanon on 2017-07-19.
 */

public class MovieArrayAdapter extends ArrayAdapter<Movie> {


    public MovieArrayAdapter(Context context, ArrayList<Movie> movies){
        super(context, android.R.layout.simple_list_item_1,movies);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Movie movie = getItem(position);

        if (convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie,parent,false);

        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivMovieImage);
        imageView.setImageResource(0);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvOverview = (TextView) convertView.findViewById(R.id.tvOverview);

        tvTitle.setText(movie.getOriginalTitle());
        tvOverview.setText(movie.getOverview());

        Picasso.with(getContext()).load(movie.getPosterpath()).into(imageView);

        return convertView;
    }
}
