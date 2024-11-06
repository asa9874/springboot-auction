package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AuctionuserInfoDTO;
import com.example.model.Item;
import com.example.service.AuctionUserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
@Tag(name = "유저API", description = "/user")
public class AuctionUserController {
    
    @Autowired
    private final AuctionUserService auctionUserService;

    @PostMapping("/login")
    public void userLogin(){}

    @PostMapping("/register")
    public void userRegister(){}

    @GetMapping("/info/{id}")
    public AuctionuserInfoDTO userInfo(@PathVariable("id") long id){
        return auctionUserService.getUserInfo(id);
    }

    @GetMapping("/item")
    public List<Item> userItem(){
        Long userId = 104L; //TODO: 로그인되있는 사용자 가져오는로직
        return auctionUserService.AuctionuserItem(userId);
    }

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
