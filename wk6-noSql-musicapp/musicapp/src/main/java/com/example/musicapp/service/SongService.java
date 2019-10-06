package com.example.musicapp.service;


import com.example.musicapp.model.Song;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface SongService {
   public Song saveSong(Song song);
   public HttpStatus deleteSong(String songId);
   public Song updateSong(String title, String newTitle);
   public List<Song> listSongs();
}
