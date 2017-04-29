package com.android.example.newsapp;

/**
 * Created by MOHANAAD on 4/4/17.
 */

public class News {

    private String mTitle;

    private String mSectionName;

    private String mUrl;

    public News(String title, String sectionName, String url) {

        mTitle = title;
        mSectionName = sectionName;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getUrl() {
        return mUrl;
    }
}
