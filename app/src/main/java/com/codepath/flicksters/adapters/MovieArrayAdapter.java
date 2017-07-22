package com.codepath.flicksters.adapters;

import android.content.Context;
import android.content.res.Configuration;
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


    private static class ViewHolder {
        ImageView ivMovieImage;
        TextView tvTitle;
        TextView tvOverview;
    }

    public MovieArrayAdapter(Context context, ArrayList<Movie> movies) {
        super(context, android.R.layout.simple_list_item_1, movies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Movie movie = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_movie, parent, false);
            viewHolder.ivMovieImage = (ImageView) convertView.findViewById(R.id.ivMovieImage);
            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
            viewHolder.tvOverview = (TextView) convertView.findViewById(R.id.tvOverview);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.ivMovieImage.setImageResource(0);
        viewHolder.tvOverview.setText(movie.getOverview());
        viewHolder.tvTitle.setText(movie.getOriginalTitle());
        // Return the completed view to render on screen
        int orientation =  getContext().getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            Picasso.with(getContext()).load(movie.getPosterpath()).into(viewHolder.ivMovieImage);
        }
        else if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            Picasso.with(getContext()).load(movie.getBackdroppath()).into(viewHolder.ivMovieImage);
        }
        return convertView;

    }

}
