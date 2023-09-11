package com.example.FirstSpringProj.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String artist;
    private int songCount;
    private int lengthInSec;


    @OneToMany(mappedBy = "album" , cascade = CascadeType.ALL)
    List<Song> songs;
    private String url;
    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }


    public Album(String title, String artist, int songCount, int lengthInSec, String url, List<Song> songs) {

        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.url = url;
        this.songs = songs;
    }




    public Album(String title, String artist, int songCount, int lengthInSec, String url) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.url = url;
    }


    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLengthInSec(int lengthInSec) {
        this.lengthInSec = lengthInSec;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLengthInSec() {
        return lengthInSec;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Title : " + title ;
    }
}
