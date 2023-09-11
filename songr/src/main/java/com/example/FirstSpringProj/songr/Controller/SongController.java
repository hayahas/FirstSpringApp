package com.example.FirstSpringProj.songr.Controller;

import com.example.FirstSpringProj.songr.exceptions.AlbumsNotFoundExceptions;
import com.example.FirstSpringProj.songr.models.Album;
import com.example.FirstSpringProj.songr.models.Song;
import com.example.FirstSpringProj.songr.repositries.AlbumsRepositry;
import com.example.FirstSpringProj.songr.repositries.SongRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumsRepositry albumsRepositry;

    @Autowired
    SongRepositry songRepositry;

    @PostMapping("/addsong")
    public RedirectView addSong(String songTitle, int songLengthInSec,int trackNumber, Long albumId){
    Album album = albumsRepositry.findById(albumId)
            .orElseThrow(() -> new AlbumsNotFoundExceptions("Could not find Album for this song "));

    Song song = new Song(songTitle,songLengthInSec,trackNumber,album);
    songRepositry.save(song);
    return new RedirectView("/");
}



}
