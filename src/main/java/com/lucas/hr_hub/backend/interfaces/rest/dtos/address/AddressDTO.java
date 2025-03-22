package com.lucas.hr_hub.backend.application.dtos;

import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.domain.entities.User;

import lombok.Data;

@Data
public class AddressDTO {
    private Long id;
    private User user;
    private String ZIPcode;
    private int houseNum;
    private String street;
    private String city;
    private String state;
    private String country;

    public AddressDTO(Address address) {
        this.id = address.getId();
        this.user = address.getUser();
        this.ZIPcode = address.getZIPcode();
        this.houseNum = address.getHouseNum();
        this.street = address.getStreet();
        this.city = address.getCity();
        this.state = address.getState();
        this.country = address.getCountry();
    }

    public AddressDTO() {
    }

}
