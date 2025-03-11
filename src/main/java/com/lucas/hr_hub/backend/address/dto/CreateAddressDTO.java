package com.lucas.hr_hub.backend.address.dto;

import com.lucas.hr_hub.backend.user.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateAddressDTO {

    private User user;

    @NotNull(message = "ZIPcode cannot be empty")
    private int ZIPcode;

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

    public CreateAddressDTO(User user, int ZIPcode, int houseNum, String street, String city, String state,
            String country) {
        this.user = user;
        this.ZIPcode = ZIPcode;
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public CreateAddressDTO() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getZIPcode() {
        return ZIPcode;
    }

    public void setZIPcode(int zIPcode) {
        ZIPcode = zIPcode;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}