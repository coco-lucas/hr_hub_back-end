package com.lucas.hr_hub.backend.Address;

import com.lucas.hr_hub.backend.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Builder 
@ToString
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @NotNull
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
}
