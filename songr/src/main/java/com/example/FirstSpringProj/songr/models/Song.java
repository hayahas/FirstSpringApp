package com.example.FirstSpringProj.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String songTitle;
    private int songLengthInSec;
    private int trackNumber;
    @ManyToOne
    private Album album;

    public Song() {
    }

    public Song(String songTitle, int songLengthInSec,int trackNumber, Album album) {
        this.songTitle = songTitle;
        this.songLengthInSec = songLengthInSec;
        this.trackNumber=trackNumber;
        this.album = album;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
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
