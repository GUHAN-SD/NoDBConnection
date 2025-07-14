package com.example.demo.controller;






import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CController {

   

    @GetMapping("/")
    public String home() {
        // Show login page
        return "Login"; // Login.jsp under /webapp/pages/ or wherever your prefix points
    }

    @PostMapping("/index")
    public String showIndex() {
        // After login redirect to index page (dashboard or student list)
        return "index"; // index.jsp
    }

    @GetMapping("/addStudentForm")
    public String showAddStudentForm() {
        // Show the form for adding a new student
        return "index"; // addStudent.jsp (create this JSP)
    }

}

