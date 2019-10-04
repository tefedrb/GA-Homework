package com.example.musicapp.controller;

import com.example.musicapp.model.Song;
import com.example.musicapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/removesong")
    public void removeSong(Song song){
        songService.deleteSong(song);
    }

}
