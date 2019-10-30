package com.example.songsapi.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "artist")
    private String artist;
    @Column(name = "title")
    private String title;
    @Column(name = "length")
    private String length;

    public Song() {}

    public Song(long id, String artist, String title, String length) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Song{")
                .append("id:").append(id)
                .append(",artist:").append(artist)
                .append(",title:").append(title)
                .append(",length:").append(length)
                .append("}");
        return s.toString();
    }
}
