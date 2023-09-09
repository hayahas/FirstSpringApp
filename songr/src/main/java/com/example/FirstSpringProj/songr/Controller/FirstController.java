package com.example.FirstSpringProj.songr.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class FirstController {


//localhost:8080/
    @GetMapping("/ourApp")
    public String basicRes(){
        return "SongrApp.html" ;

    }

    //localhost:8080/hello
    @GetMapping("/hello")
    public String firstRes(){
    return "first.html" ;

    }

    //localhost:8080/capitalize/TextWanted
    @GetMapping("/capitalize/{txt}")
    public String secondRes(Model m , @PathVariable String txt ){
        m.addAttribute("txt",txt.toUpperCase());
        return "second.html";
    }




}
