package com.example.FirstSpringProj.songr.repositries;

import com.example.FirstSpringProj.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepositry extends JpaRepository<Song,Long> {
}
