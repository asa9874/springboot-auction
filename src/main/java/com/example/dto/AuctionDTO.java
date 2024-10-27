package com.example.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionDTO {
    private Long id;

    private LocalDateTime auctionDate;

    private Integer auctionPrice;

    private String itemName;

    private String itemDescription;

    private Integer itemCount;

    private String userName;
}
