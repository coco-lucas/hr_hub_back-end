package com.lucas.hr_hub.backend.application.useCases.address;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.lucas.hr_hub.backend.application.dtos.AddressDTO;
import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;

public class GetAllAddressUseCase {
    private final AddressRepository repository;
    private final ModelMapper modelMapper;

    public GetAllAddressUseCase(AddressRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public List<AddressDTO> execute() {
        return repository.findAll()
                .stream()
                .map(address -> modelMapper
                        .map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }
}
