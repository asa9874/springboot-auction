package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.userInfoDTO;
import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;
    
    public userInfoDTO getUserInfo(Long id){
        User user = userRepository.findById(id).get();
        userInfoDTO dto= new userInfoDTO();
        dto.setEmail(user.getEmail());
        dto.setMoney(user.getMoney());
        dto.setUserNickname(user.getUsernickname());
        return dto;
    }
}
