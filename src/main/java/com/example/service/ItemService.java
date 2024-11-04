package com.example.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ItemDTO;
import com.example.model.Item;
import com.example.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item getItemById(Long id){
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        
        return itemRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException());
    }

    public Item createItem(ItemDTO itemdto){
        if (itemRepository.existsByName(itemdto.getName())) {
            throw new IllegalArgumentException("Item with this name already exists");
        }
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
        throw new NoSuchElementException("Item not found with id " + id);
    }
    
}
