package com.example.musicapp.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class Song {
    @Indexed(unique = true)
    private String artist;
    private String title;
    private String length;

    public Song(){}

    public String getArtst(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    public String getLength(){
        return length;
    }

    public void setLength(String length){
        this.length = length;
    }

}
