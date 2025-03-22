package com.lucas.hr_hub.backend.infrastructure.persistence.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.lucas.hr_hub.backend.application.dtos.AddressDTO;
import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;

public class JpaAddressRepository implements AddressRepository {
    private final SpringDataJpaAddressRepository jpaRepository;
    private final ModelMapper modelMapper;

    public JpaAddressRepository(SpringDataJpaAddressRepository jpaRepository, ModelMapper modelMapper) {
        this.jpaRepository = jpaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AddressDTO> findAll() {
        return jpaRepository.findAll().stream().map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Address save(CreateAddressDTO address) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<AddressDTO> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}