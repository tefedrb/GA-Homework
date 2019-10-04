package com.example.musicapp.service;


import com.example.musicapp.model.Song;

import java.util.List;

public interface SongService {
   public Song saveSong(Song song);
   public void deleteSong(Song song);

   public List<Song> listSongs();
}
