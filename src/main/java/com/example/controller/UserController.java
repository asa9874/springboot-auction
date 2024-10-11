package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login_form(){
        return "login_form";
    }

    @GetMapping("/register")
    public String register_form(){
        return "register_form";
    }
}
