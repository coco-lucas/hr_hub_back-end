package com.lucas.hr_hub.backend.address.dto;

import com.lucas.hr_hub.backend.address.domain.Address;
import com.lucas.hr_hub.backend.user.User;

public class AddressDTO {
    private Long id;
    private User user;
    private int ZIPcode;
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

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getZIPcode() {
        return this.ZIPcode;
    }

    public void setZIPcode(int ZIPcode) {
        this.ZIPcode = ZIPcode;
    }

    public int getHouseNum() {
        return this.houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", user='" + getUser() + "'" +
                ", ZIPcode='" + getZIPcode() + "'" +
                ", houseNum='" + getHouseNum() + "'" +
                ", street='" + getStreet() + "'" +
                ", city='" + getCity() + "'" +
                ", state='" + getState() + "'" +
                ", country='" + getCountry() + "'" +
                "}";
    }
}
