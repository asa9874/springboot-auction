package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Auction;
import com.example.repository.AuctionRepository;

@Service
public class AuctionService {
    @Autowired
    private AuctionRepository auctionRepository;

    //todo DTO로바꿔야함
    public List<Auction> getAutionItems(){
        return auctionRepository.findAll();

    }
}
