package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {
    @NotBlank
    private String imgurl;

    @NotBlank
    private String name;

    @NotBlank
    private String Description;
}
