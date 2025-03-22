package com.lucas.hr_hub.backend.application.cases.address;

import org.springframework.stereotype.Component;

import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;
import com.lucas.hr_hub.backend.domain.services.address.CreateAddressService;

@Component
public class CreateAddressUseCase {
    private final CreateAddressService addressService;
    private final AddressRepository addressRepository;

    public CreateAddressUseCase(CreateAddressService addressService, AddressRepository addressRepository) {
        this.addressService = addressService;
        this.addressRepository = addressRepository;
    }

    public Address execute(Address address) {

    }
}
