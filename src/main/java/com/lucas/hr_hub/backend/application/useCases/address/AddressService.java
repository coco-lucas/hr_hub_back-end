package com.lucas.hr_hub.backend.application.useCases.address;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.infrastructure.external.ProcessAddressInterface;
import com.lucas.hr_hub.backend.infrastructure.persistence.JpaAddressRepository;
import com.lucas.hr_hub.backend.interfaceAdapters.dtos.AddressDTO;
import com.lucas.hr_hub.backend.interfaceAdapters.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.interfaceAdapters.dtos.UpdateAddressDTO;

@Service
public class AddressService {

    @Autowired
    private JpaAddressRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProcessAddressInterface processAddress;

    // GET method
    public List<AddressDTO> getAllAddress() {
        return repository.findAll().stream().map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }

    // POST methods
    public AddressDTO createAddress(CreateAddressDTO dto) {
        Address address;

        if (dto.getCountry().trim().equalsIgnoreCase("Brazil") ||
                dto.getCountry().trim().equalsIgnoreCase("Brasil")) {
            address = handleBrazilianAddress(dto);
        } else {
            address = modelMapper.map(dto, Address.class);
        }
        address = repository.save(address);
        return modelMapper.map(address, AddressDTO.class);
    }

    public Address handleBrazilianAddress(CreateAddressDTO dto) {
        Address address = processAddress.getAddressByCEP(dto.getZIPcode());
        address.setUser(dto.getUser());
        address.setHouseNum(dto.getHouseNum());
        address.setCountry(dto.getCountry());

        return address;
    }

    // UPDATE method
    public Optional<AddressDTO> updateAddress(Long id, UpdateAddressDTO dto) {
        if (!repository.existsById(id)) {
            return Optional.empty();
        }
        Address address = repository.findById(id).orElseThrow();
        modelMapper.map(dto, address);

        address = repository.save(address);
        return Optional.of(modelMapper.map(address, AddressDTO.class));
    }

}