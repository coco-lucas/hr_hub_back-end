package com.lucas.hr_hub.backend.interfaceAdapters.dtos;

import com.lucas.hr_hub.backend.domain.entities.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateAddressDTO {

    private User user;

    @NotNull(message = "ZIPcode cannot be empty")
    private String ZIPcode;

    @NotNull
    private int houseNum;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

}