package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CController {

   

    @GetMapping("/")
    public String home() {
        // Show login page
        return "pages/Login"; // Login.jsp under /webapp/pages/ or wherever your prefix points
    }

}

