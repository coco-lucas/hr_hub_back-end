package com.lucas.hr_hub.backend.Address;

import com.lucas.hr_hub.backend.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "adress")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder @ToString
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private int ZIPcode;
    
    private int houseNum;

    private String street;

    private String city;
    
    private String state;

    private String country;
}
