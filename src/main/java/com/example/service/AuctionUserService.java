package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.AuctionuserInfoDTO;
import com.example.model.AuctionUser;
import com.example.repository.AuctionUserRepository;

@Service
public class AuctionUserService {
    @Autowired
    private  AuctionUserRepository userRepository;
    
    public AuctionuserInfoDTO getUserInfo(Long id){
        AuctionUser user = userRepository.findById(id).get();
        AuctionuserInfoDTO dto= new AuctionuserInfoDTO();
        dto.setEmail(user.getEmail());
        dto.setMoney(user.getMoney());
        dto.setUserNickname(user.getUsernickname());
        return dto;
    }
}
