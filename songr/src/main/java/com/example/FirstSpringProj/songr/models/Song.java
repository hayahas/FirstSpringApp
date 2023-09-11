package com.example.FirstSpringProj.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String songTitle;
    private int songLengthInSec;

    @ManyToOne
    private Album album;

    public Song() {
    }

    public Song(String songTitle, int songLengthInSec, Album album) {
        this.songTitle = songTitle;
        this.songLengthInSec = songLengthInSec;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getSongLengthInSec() {
        return songLengthInSec;
    }

    public void setSongLengthInSec(int songLengthInSec) {
        this.songLengthInSec = songLengthInSec;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
