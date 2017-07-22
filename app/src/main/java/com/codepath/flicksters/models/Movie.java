package com.codepath.flicksters.models;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Movie {
    String posterpath;

    String originalTitle;
    String overview;
    String backdroppath;



    public Movie (JSONObject jsonObject) throws JSONException{
        this.posterpath = jsonObject.getString("poster_path");
        this.originalTitle = jsonObject.getString("original_title");
        this.overview = jsonObject.getString("overview");
        this.backdroppath = jsonObject.getString("backdrop_path");
    }

    public String getBackdroppath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", backdroppath);
    }



    public String getPosterpath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterpath);
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public static ArrayList<Movie> fromJSONArray(JSONArray array){
        ArrayList<Movie> results = new ArrayList<>();

        for (int x=0; x < array.length(); x++){
            try {
                results.add(new Movie(array.getJSONObject(x)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return results;
    }
}
