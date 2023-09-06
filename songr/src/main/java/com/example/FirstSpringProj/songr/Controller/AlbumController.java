package com.example.FirstSpringProj.songr.Controller;

import com.example.FirstSpringProj.songr.models.Album;
import com.example.FirstSpringProj.songr.repositries.AlbumsRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumsRepositry albumsRepositry;
    @PostMapping("/createalbum")
    public RedirectView createAlbums(String tile,String artist, int songCount, int lengthInSec,String url){

        Album album = new Album(tile,artist,songCount,lengthInSec,url);

           albumsRepositry.save(album);
        return new RedirectView("/");
    }

    @GetMapping("/")
    public String getAllAlbums(Model m)
    {
        List<Album> albums = albumsRepositry.findAll();
        m.addAttribute("albums", albums);
        return "albums.html";
    }

//    @GetMapping("/")
//public String getAllAlbums(Model m){
//        List<Album> albums = albumsRepositry.findAll();
//        m.addAttribute("albums",albums);
//        return "albums.html";
//}




//    @GetMapping("/album")
//    public String albumRes(Model m){
//        ArrayList<Album> albums=new ArrayList<>();
//        albums.add(new Album(1,"album1","artist1",10,100,"https//:"));
//        albums.add(new Album(2,"album2","artist2",10,100,"https//:"));
//        albums.add(new Album(3,"album3","artist3",10,100,"https//:"));
//
//        m.addAttribute("albums",albums);
//        return "albums.html";
//
//    }
}
