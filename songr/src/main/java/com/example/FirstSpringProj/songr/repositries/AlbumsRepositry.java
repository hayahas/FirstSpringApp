package com.example.FirstSpringProj.songr.repositries;

import com.example.FirstSpringProj.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepositry extends JpaRepository<Album, Long> {
//    String findByName(String title);
}
