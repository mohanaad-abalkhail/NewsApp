package com.android.example.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by MOHANAAD on 4/4/17.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {


    private String mUrl;


    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> Books = com.android.example.newsapp.QueryUtils.fetchNewsData(mUrl);
        return Books;
    }
}
