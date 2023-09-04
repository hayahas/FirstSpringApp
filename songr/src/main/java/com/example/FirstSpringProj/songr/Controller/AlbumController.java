package com.example.FirstSpringProj.songr.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

public class AlbumController {
@ResponseBody
    @GetMapping("/album")
    public String albumRes(Model m){
        ArrayList <Album> albums=new ArrayList<>();
        albums.add(new Album("album1"));
        albums.add(new Album("album2"));
        albums.add(new Album("album3"));

        m.addAttribute("albums",albums);
        return "albums.html";
    }
}
