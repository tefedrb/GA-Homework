package com.example.musicapp.controller;

import com.example.musicapp.model.Song;
import com.example.musicapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/list")
    public List<Song> listSongs(){
        return songService.listSongs();
    }

    @PostMapping("/addsong")
    public Song saveSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }

    @DeleteMapping("/removesong/{songId}")
    public HttpStatus deleteSong(String songId){
        return songService.deleteSong(songId);
    }

}
