package com.example.musicapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Song {
    @Id
    private String id;

    private String artist;
    private String title;
    private String length;

    public Song(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtst(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getLength(){
        return length;
    }

    public void setLength(String length){
        this.length = length;
    }

}
