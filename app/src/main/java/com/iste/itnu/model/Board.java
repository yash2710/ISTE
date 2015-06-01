package com.iste.itnu.model;

/**
 * Created by Yash on 15-Jan-15.
 */
public class Board {
    private String name,url,position,mail;

    public Board(String name, String position, String url, String mail){
        this.name = name;
        this.position = position;
        this.url = url;
        this.mail = mail;
    }

    public String getName(){return name;}

    public String getPosition(){return position;}

    public String getUrl(){return url;}

    public String getMail(){return mail;}
}
