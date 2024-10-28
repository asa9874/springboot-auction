package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user/{userid}")
@Tag(name = "유저API", description = "/user")
public class UserController {
    @PostMapping("/login")
    public void userLogin(){}

    @PostMapping("/register")
    public void userRegister(){}

    @GetMapping("/info")
    public void userInfo(){}

    @GetMapping("/item")
    public void UserItem(){}

    @GetMapping("/autionitem")
    public void userAuctionItem(){}

    @PostMapping("/updateinfo")
    public void userInfoUpdate(){}

    @PostMapping("/charge/{money}")
    public void userChargeMoney(){}

    @PostMapping("/upload/{itemid}")
    public void userUploadItem(){}

    @PostMapping("/unload/{itemid}")
    public void userUnloadItem(){}
}
