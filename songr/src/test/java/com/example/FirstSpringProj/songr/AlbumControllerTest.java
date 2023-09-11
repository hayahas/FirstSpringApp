package com.example.FirstSpringProj.songr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AlbumControllerTest {

    @Autowired
    MockMvc mockMvc;

//    @Test
//    public void testPostNewAlbum() throws Exception {
//        mockMvc.perform(
//                        post("/")
//                                .contentType(MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
//                                .param("title", "FirstChance")
//                                .param("artist", String.valueOf(200))
//                )
//                .andExpect(redirectedUrl("/"))
//                .andExpect(status().isFound());
//    }

//    @Test
//    public void testAddAlbum() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/"))
//                .andDo(print())
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string(containsString("<form action=\"/createalbum\" method=\"post\">")))
//                .andExpect(MockMvcResultMatchers.content().string(containsString("<h1> Albums</h1>")));
//
//    }


}
