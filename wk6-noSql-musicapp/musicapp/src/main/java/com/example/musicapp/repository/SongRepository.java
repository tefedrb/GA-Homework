package com.example.musicapp.repository;

import com.example.musicapp.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SongRepository extends MongoRepository<Song, String> {
    public void deleteById (String songId);

    @Query(" {'title' : ?0} ")
    public Song findByTitle (String title);
}
