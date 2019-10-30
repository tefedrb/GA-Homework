package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import org.springframework.http.HttpStatus;

public interface SongService {

    public Iterable<Song> getAll();

    public Song searchById(long id);

    public Iterable<Song> searchByArtist(String name);

    public HttpStatus deleteSong(long id);

    public HttpStatus createSong(Song user);

    public HttpStatus updateSong(long id, Song userRequest);
}
