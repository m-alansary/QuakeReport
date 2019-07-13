package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "Loader Started");
        forceLoad();
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        Log.i(LOG_TAG, "Loader is In Backgound");
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.extractEarthquakes(mUrl);
    }
}