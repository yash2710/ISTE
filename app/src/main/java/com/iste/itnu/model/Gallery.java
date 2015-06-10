package com.iste.itnu.model;

/**
 * Created by Yash on 31-Dec-14.
 */

public class Gallery {
    private String title, thumbnailUrl;
    private int year;

    public Gallery() {
    }

    public Gallery(String name, String thumbnailUrl, int year) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String name) {
//        this.title = name;
//    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

//    public void setThumbnailUrl(String thumbnailUrl) {
//        this.thumbnailUrl = thumbnailUrl;
//    }

    public String getYear() {
        return String.valueOf(year);
    }

//    public void setYear(int year) {
//        this.year = year;
//    }

}
