package com.codepath.flicksters;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.codepath.flicksters.adapters.MovieArrayAdapter;
import com.codepath.flicksters.models.Movie;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MovieActivity extends AppCompatActivity {
    ArrayList<Movie> movies;
    MovieArrayAdapter movieAdapter;
    ListView lvItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        lvItems = (ListView) findViewById(R.id.lvMovies);
        movies = new ArrayList<>();
        movieAdapter = new MovieArrayAdapter(this,movies);
        lvItems.setAdapter(movieAdapter);

        String url= " https://api.themoviedb.org/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed";

        AsyncHttpClient client= new AsyncHttpClient();

        client.get(url,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
              JSONArray movieJasonResults = null;

                try {
                    movieJasonResults = response.getJSONArray("results");
                    movies.addAll(Movie.fromJSONArray(movieJasonResults));
                    movieAdapter.notifyDataSetChanged();
                    Log.d("DEBUG", movies.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
