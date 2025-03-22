package com.lucas.hr_hub.backend.application.useCases.address;

import org.modelmapper.ModelMapper;

import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;

public class CreateAddressUseCase {
    private final AddressRepository repository;
    private final HandleBrazilianAddressUseCase brazilianAddressUseCase;
    private final ModelMapper modelMapper;

    public CreateAddressUseCase(
            AddressRepository repository,
            HandleBrazilianAddressUseCase brazilianAddressUseCase,
            ModelMapper modelMapper) {
        this.repository = repository;
        this.brazilianAddressUseCase = brazilianAddressUseCase;
        this.modelMapper = modelMapper;
    }

    public Address execute(CreateAddressDTO dto) {
        Address address;
        if (dto.getCountry().trim().equalsIgnoreCase("Brazil") ||
                dto.getCountry().trim().equalsIgnoreCase("Brasil")) {
            address = brazilianAddressUseCase.execute(dto);
            return repository.save(modelMapper.map(address, CreateAddressDTO.class));
        }
        return repository.save(dto);
    }
}
