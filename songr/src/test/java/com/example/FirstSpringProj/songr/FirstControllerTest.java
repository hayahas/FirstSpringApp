package com.example.FirstSpringProj.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class FirstControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testWelcomePage() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/ourApp"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("SongrApp.html"));

//                .andExpect(MockMvcResultMatchers.content().string(containsString("<h1>Welcome To Sonqr App</h1>")))
//                .andExpect(MockMvcResultMatchers.content().string(containsString("<p>In this web App we have Different Routes: </p>")));

    }

    @Test
    public void testHelloWorldPage() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("first.html"));

    }

    @Test
    public void testCapitalizeTextPage() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/capitalize/capitalized text"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("second.html"))
                .andExpect(MockMvcResultMatchers.model().attribute("txt", "CAPITALIZED TEXT"));

    }



}
