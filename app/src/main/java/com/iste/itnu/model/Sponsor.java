package com.iste.itnu.model;

/**
 * Created by Yash on 06-Jan-15.
 */
public class Sponsor {
    private String title, thumbnailUrl, link;

    public Sponsor() {
    }

    public Sponsor(String name, String thumbnailUrl, String link) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

}
