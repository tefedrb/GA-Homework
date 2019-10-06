package com.example.musicapp.service;

import com.example.musicapp.model.Song;
import com.example.musicapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    SongRepository songRepository;

    @Override
    public Song saveSong(Song song){
        return songRepository.save(song);
    }

    @Override
    public List<Song> listSongs(){
        return songRepository.findAll();
    }

    @Override
    public HttpStatus deleteSong(String songId){
        songRepository.deleteById(songId);
        return HttpStatus.valueOf(200);
    }

    @Override
    public Song updateSong(String title, String newTitle){
        Song updated = songRepository.findByTitle(title);
        updated.setTitle(newTitle);
        return songRepository.save(updated);
    }
}
