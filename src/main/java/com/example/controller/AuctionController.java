package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Auction;
import com.example.service.AuctionService;

@RestController
@RequestMapping("/auction")
public class AuctionController {
    
    @Autowired
    AuctionService auctionService;

    @GetMapping("/")
    public List<Auction> getAutionItems(){
        return auctionService.getAutionItems();
    }

    @GetMapping("/{id}")
    public Auction getAutionItemById(@PathVariable("id") String id){
        return new Auction();
    }
}
