package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AuctionuserInfoDTO;
import com.example.service.AuctionUserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user/{userid}")
@Tag(name = "유저API", description = "/user")
public class AuctionUserController {
    
    private final AuctionUserService userService;


    @PostMapping("/login")
    public void userLogin(){}

    @PostMapping("/register")
    public void userRegister(){}

    @GetMapping("/info/{id}")
    public AuctionuserInfoDTO userInfo(@PathVariable("id") long id){
        return userService.getUserInfo(id);
    }

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
