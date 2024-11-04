package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ItemDTO;
import com.example.model.Item;
import com.example.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Optional<Item> getItemById(Long id){
        return itemRepository.findById(id);
    }

    public Item createItem(ItemDTO itemdto){
        Item item = Item.builder()
            .imgurl(itemdto.getImgurl())
            .name(itemdto.getName())
            .description(itemdto.getDescription())
            .build();
        return itemRepository.save(item);
    }


    public boolean deleteItem(Long id){
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true; 
        }
        return false; 
    }

    public Item modifyItem(Long id, Item item) {
        if (itemRepository.existsById(id)) {
            item.setId(id); 
            return itemRepository.save(item); 
        }
        return null;
    }
    
}
