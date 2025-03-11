package com.lucas.hr_hub.backend.address.dto;

public class UpdateAddressDTO {
    private Long id;
    private int ZIPCode;
    private int houseNum;
    private String street;
    private String city;
    private String state;
    private String country;

    public UpdateAddressDTO(Long id, int ZIPCode, int houseNum, String street, String city, String state,
            String country) {
        this.id = id;
        this.ZIPCode = ZIPCode;
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public UpdateAddressDTO() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZIPCode() {
        return this.ZIPCode;
    }

    public void setZIPCode(int ZIPCode) {
        this.ZIPCode = ZIPCode;
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
}
