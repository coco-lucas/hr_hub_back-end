package com.lucas.hr_hub.backend.application.useCases.address;

import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;

public class CreateAddressUseCase {
    private final AddressRepository repository;

    public CreateAddressUseCase(AddressRepository repository) {
        this.repository = repository;
    }

}
