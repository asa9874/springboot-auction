package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.dto.AuctionuserInfoDTO;
import com.example.model.AuctionUser;
import com.example.model.Item;
import com.example.repository.AuctionUserRepository;

@Service
public class AuctionUserService {
    @Autowired
    private  AuctionUserRepository auctionUserRepository;
    
    public AuctionuserInfoDTO getUserInfo(Long id){
        AuctionUser user = auctionUserRepository.findById(id).get();
        AuctionuserInfoDTO dto= new AuctionuserInfoDTO();
        dto.setEmail(user.getEmail());
        dto.setMoney(user.getMoney());
        dto.setUserNickname(user.getUsernickname());
        return dto;
    }

    public List<Item> AuctionuserItem(Long id){
        Optional<AuctionUser> optionalUser = auctionUserRepository.findById(id);
        if (optionalUser.isPresent()) {
            AuctionUser user = optionalUser.get();
            return user.getItem();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
    }
}
