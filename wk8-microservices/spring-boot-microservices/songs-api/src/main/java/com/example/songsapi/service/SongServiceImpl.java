package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import com.example.songsapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public Iterable<Song> getAll() {
        return songRepository.findAll();
    }

    @Override
    public Song searchById(long id) {
        return songRepository.findById(id).get();
    }

    @Override
    public Iterable<Song> searchByArtist(String artist) {
        String normalized = artist.trim().toLowerCase();
        return songRepository.findByFirstNameContainsOrLastNameContains(normalized, normalized);
    }

    @Override
    public HttpStatus deleteSong(long id) {
        songRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @Override
    public HttpStatus createSong(Song song) {
        songRepository.save(song);
        return HttpStatus.OK;
    }

    @Override
    public HttpStatus updateSong(long id, Song songRequest) {
        Song song = songRepository.findById(id).get();
        song.setTitle(songRequest.getTitle());
        song.setArtist(songRequest.getArtist());
        song.setLength(songRequest.getLength());
        songRepository.save(song);
        return HttpStatus.OK;
    }
}
