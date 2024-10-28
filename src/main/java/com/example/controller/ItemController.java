package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ItemDTO;
import com.example.service.ItemService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/item")
@Tag(name = "아이템API", description = "/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/{id}")
    public ItemDTO getItemById(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }

    @PostMapping("/create")
    public void createItem(){}

    @PostMapping("/delete")
    public void delteItem(){}

    @PostMapping("/modify")
    public void modifyItem(){}
}
