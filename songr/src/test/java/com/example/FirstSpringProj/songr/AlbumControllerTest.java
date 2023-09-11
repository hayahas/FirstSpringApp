package com.example.FirstSpringProj.songr;
import com.example.FirstSpringProj.songr.models.Album;
import com.example.FirstSpringProj.songr.repositries.AlbumsRepositry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AlbumControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AlbumsRepositry albumRepository;

   @Test
    public void testPostNewAlbum() throws Exception {
        mockMvc.perform(
                       post("/createalbum")
                               .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                                .param("title", "FirstChance")
                               .param("artist", "taylor")
                               .param("songCount", String.valueOf(5))
                               .param("lengthInSec",  String.valueOf(1500))
                               .param("url", "https://ex.com")


                )
               .andExpect(redirectedUrl("/"))
               .andExpect(status().isFound());
    }

       @Test
    public void testgetAlbums() throws Exception {
       mockMvc.perform(MockMvcRequestBuilders.get("/"))
               .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.view().name("albums.html"));
//               .andExpect(MockMvcResultMatchers.content().string(containsString("<form action=\"/createalbum\" method=\"post\">")))
//               .andExpect(MockMvcResultMatchers.content().string(containsString("<h1> Albums</h1>")));

   }


//    @Test
//    public void testAddingSong()  throws Exception{
//       mockMvc.perform(
//               post("/addsong")
//                       .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//                       .param("songTitle","anything")
//                       .param("songLengthInSec",String.valueOf(1505))
//                       .param("trackNumber", String.valueOf(2))
//                       .param("albumId", String.valueOf(2))
//
//
//       ).andExpect(MockMvcResultMatchers.redirectedUrl("/"))
//               .andExpect(MockMvcResultMatchers.status().isFound());
//    }



}
