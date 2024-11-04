package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ItemDTO;
import com.example.model.Item;
import com.example.service.ItemService;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/item")
@Tag(name = "아이템API", description = "/item")
public class ItemController {
    
    private final ItemService itemService;

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }

    @PostMapping("/create")
    public Item createItem(@Valid @RequestBody ItemDTO itemdto){
        return itemService.createItem(itemdto);
    }

    @DeleteMapping("/{id}")
    public boolean delteItem(@PathVariable("id") Long id){
        return itemService.deleteItem(id);
    }

    @PutMapping("/modify/{id}")
    public Item modifyItem(@PathVariable("id") Long id, @RequestBody Item item){
        return itemService.modifyItem(id, item);
    }
}
