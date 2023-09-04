package com.example.FirstSpringProj.songr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

@ResponseBody
    @GetMapping("/hello")
    public String firstRes(){
        return "hello world";
    }
@ResponseBody
    @GetMapping("/he")
    public String secondRes( ){
        return "second.html";
    }


}
