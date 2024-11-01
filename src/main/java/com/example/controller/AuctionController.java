package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.AuctionDTO;
import com.example.service.AuctionService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auction")
@Tag(name = "경매물품API", description = "/auction")
public class AuctionController {
    
    
    private final AuctionService auctionService;

    @GetMapping("/")
    public List<AuctionDTO> autionItems(){
        return auctionService.getAutionItems();
    }

    @GetMapping("/{id}")
    public AuctionDTO autionItemById(@PathVariable("id") Long id){
        return auctionService.getAutionItemById(id);
    }

    @PostMapping("{auctionId}/purchase")
    public void autionPurchase(){}
}
