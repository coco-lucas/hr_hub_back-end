package com.lucas.hr_hub.backend.infra.persistence.adapters;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;

import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.domain.repositories.AddressRepository;
import com.lucas.hr_hub.backend.infra.persistence.entities.AddressEntity;
import com.lucas.hr_hub.backend.infra.persistence.repositories.JpaAddressRepository;

//adapta todas as funções para a função -> JPA
public class AddressRepositoryAdapter implements AddressRepository {
    private final JpaAddressRepository jpaRepository;
    private ModelMapper modelMapper;

    public AddressRepositoryAdapter(JpaAddressRepository jpaRepository, ModelMapper modelMapper) {
        this.jpaRepository = jpaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Address save(Address address) {
        AddressEntity entity = modelMapper.map(address, AddressEntity.class);
        AddressEntity savedEntity = jpaRepository.save(entity);

        return modelMapper.map(savedEntity, Address.class);
    }

    @Override
    public List<Address> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Address> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Address> findByCity(String city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCity'");
    }

    @Override
    public List<Address> findByState(String state) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByState'");
    }

    @Override
    public List<Address> findByCountry(String country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCountry'");
    }

    @Override
    public Address updateAddress(Address address, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAddress'");
    }
}