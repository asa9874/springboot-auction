package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AuctionDTO;
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


    public AuctionDTO getAutionItemById(Long id){
        Auction auction=auctionRepository.findById(id).get();
        AuctionDTO auctionDTO = new AuctionDTO();
        auctionDTO.setId(auction.getId());
        auctionDTO.setAuctionPrice(auction.getAuctionPrice());
        auctionDTO.setAuctionDate(auction.getAuctionDate());
        auctionDTO.setItemName(auction.getItem().getName());
        auctionDTO.setItemDescription(auction.getItem().getDescription());
        auctionDTO.setItemCount(auction.getItemCount());
        auctionDTO.setUserName(auction.getAuctionuser().getUsernickname());
        return auctionDTO;
    }

}
