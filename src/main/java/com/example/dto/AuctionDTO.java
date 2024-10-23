package com.example.dto;

import java.time.LocalDateTime;
import com.example.model.Item;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionDTO {
    private Long id;

    private LocalDateTime auctionDate;

    private Integer auctionPrice;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    
    private String userName;
}
