package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<AuctionDTO> getAutionItems(){
        return auctionRepository.findAll().stream()
            .map(this::convertDTO)  // 변환 메서드를 사용해 DTO로 변환
            .collect(Collectors.toList());
    }


    public AuctionDTO getAutionItemById(Long id){
        Auction auction=auctionRepository.findById(id).get();
        return convertDTO(auction);
    }

    private AuctionDTO convertDTO(Auction auction){
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
