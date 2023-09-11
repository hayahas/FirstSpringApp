package com.example.FirstSpringProj.songr;

import com.example.FirstSpringProj.songr.models.Album;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    @Test
    public void testConstructor(){
        Album a = new Album("Album1","John",10,2000,"https://ex.com");
        assertEquals("Album1", a.getTitle());
        assertEquals("John", a.getArtist());
        assertEquals(10, a.getSongCount());
        assertEquals(2000, a.getLengthInSec());
        assertEquals("https://ex.com", a.getUrl());
    }

    @Test
    public void testIdSetterAndGetter(){
        Album a =new Album();
        a.setId(1L);
        long result = a.getId();
        assertEquals(1,result);
    }
    @Test
    public void testTitleSetterAndGetter(){
        Album a =new Album();
        a.setTitle("Album2");
        String result = a.getTitle();
        assertEquals("Album2",result);
    }
    @Test
    public void testArtistSetterAndGetter(){
        Album a =new Album();
        a.setArtist("John");
        String result = a.getArtist();
        assertEquals("John",result);
    }

    @Test
    public void testSongCountSetterAndGetter(){
        Album a =new Album();
        a.setSongCount(10);
        int result = a.getSongCount();
        assertEquals(10,result);
    }
    @Test
    public void testLengthInSecSetterAndGetter(){
        Album a =new Album();
        a.setLengthInSec(1000);
        int result = a.getLengthInSec();
        assertEquals(1000,result);
    }

    @Test
    public void testUrlSetterAndGetter(){
        Album a =new Album();
        a.setUrl("myImageUrl");
        String result = a.getUrl();
        assertEquals("myImageUrl",result);
    }



}
