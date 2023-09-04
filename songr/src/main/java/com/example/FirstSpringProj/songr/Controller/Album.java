package com.example.FirstSpringProj.songr.Controller;

public class Album {
//    Create an Album class to act as a model in our app.
//    An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
//    Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)


    private String title;
    private String artist;
    private int songCount;
    private int lengthInSec;

    private String url;
    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }

    public Album(String title, String artist, int songCount, int lengthInSec, String url) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.url = url;
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
