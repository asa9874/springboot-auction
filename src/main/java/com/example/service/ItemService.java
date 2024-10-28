package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ItemDTO;
import com.example.model.Item;
import com.example.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ItemDTO getItemById(Long id){
        Item item=itemRepository.findById(id).get();
        ItemDTO dto= new ItemDTO();
        dto.setDescription(item.getDescription());
        dto.setId(item.getId());
        dto.setImgurl(item.getImgurl());
        dto.setName(item.getName());
        return dto;
    }

    
}
