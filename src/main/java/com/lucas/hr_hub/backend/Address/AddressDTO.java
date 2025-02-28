package com.lucas.hr_hub.backend.Address;

import com.lucas.hr_hub.backend.User.User;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class AddressDTO{
        Long id;
        User user;
        int ZIPcode;
        int houseNum;
        String street;
        String city;
        String state;
        String country;

        public AddressDTO(Address address){
                this.id = address.getId();
                this.user = address.getUser();
                this.ZIPcode = address.getZIPcode();
                this.houseNum = address.getHouseNum();
                this.street = address.getStreet();
                this.city = address.getCity();
                this.state = address.getState();
                this.country = address.getCountry();
        } 
}