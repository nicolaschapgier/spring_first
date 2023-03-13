package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/greetings")
    @ResponseBody
    public String index(){
        return "Greetings from Spring Boot ! <img alt='Picture sample' src='css/img/hasbulla_aurevoir.gif'>";
    }
}
