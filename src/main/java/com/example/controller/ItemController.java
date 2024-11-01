package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ItemDTO;
import com.example.model.Item;
import com.example.service.ItemService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/item")
@Tag(name = "아이템API", description = "/item")
public class ItemController {
    
    private final ItemService itemService;

    @GetMapping("/{id}")
    public ItemDTO getItemById(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }

    @PostMapping("/create")
    public Item createItem(@RequestBody Item item){
        System.out.println("Item ID: " + item.getId());
        System.out.println("Item ImgUrl: " + item.getImgurl());
        System.out.println("Item Name: " + item.getName());
        System.out.println("Item Description: " + item.getDescription());
        return itemService.createItem(item);
    }

    @PostMapping("/delete")
    public void delteItem(){}

    @PostMapping("/modify")
    public void modifyItem(){}
}
