package com.example.songsapi.controller;


import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongsController {

    @Autowired
    private SongService songService;

    @GetMapping("/allSongs")
    public Iterable<Song> getAll() {
        return songService.getAll();
    }

    @GetMapping("/viewSong/{id}")
    public Song searchById(@PathVariable long id) {
        return songService.searchById(id);
    }

    @DeleteMapping("/deleteSong/{id}")
    public HttpStatus deleteUser(@PathVariable long id) {
        return songService.deleteSong(id);
    }

    @PostMapping("/createSong")
    public HttpStatus createUser(@RequestBody Song user) {
        return songService.createSong(user);
    }

    @PatchMapping("/update/{id}")
    public HttpStatus updateUser(@PathVariable long id, @RequestBody Song userRequest) {
        return songService.updateSong(id, userRequest);
    }
}
