package com.lucas.hr_hub.backend.application.dtos;

import lombok.Data;

@Data
public class UpdateAddressDTO {
    private int ZIPCode;
    private int houseNum;
    private String street;
    private String city;
    private String state;
    private String country;

    public UpdateAddressDTO(int ZIPCode, int houseNum, String street, String city, String state,
            String country) {
        this.ZIPCode = ZIPCode;
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public UpdateAddressDTO() {

    }
}