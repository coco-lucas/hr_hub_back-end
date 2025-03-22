package com.lucas.hr_hub.backend.infra.persistence.entities;

import com.lucas.hr_hub.backend.domain.entities.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(nullable = false)
    private String ZIPcode;

    @Column(nullable = false)
    private int houseNum;

    private String street;

    private String city;

    private String state;

    @Column(nullable = false)
    private String country;

    public AddressEntity(Long id, User user, String ZIPcode, int houseNum, String street, String city, String state,
            String country) {
        this.id = id;
        this.user = user;
        this.ZIPcode = ZIPcode;
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public AddressEntity() {

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

    public String getZIPcode() {
        return this.ZIPcode;
    }

    public void setZIPcode(String ZIPcode) {
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
}
