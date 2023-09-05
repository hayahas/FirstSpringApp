package com.example.FirstSpringProj.songr.Controller;

import com.example.FirstSpringProj.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/album")
    public String albumRes(Model m){
        ArrayList<Album> albums=new ArrayList<>();
        albums.add(new Album("album1"));
        albums.add(new Album("album2"));
        albums.add(new Album("album3"));

        m.addAttribute("albums",albums);
        return "albums.html";

    }
}
