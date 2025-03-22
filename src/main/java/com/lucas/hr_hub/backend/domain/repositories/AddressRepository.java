package com.lucas.hr_hub.backend.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.lucas.hr_hub.backend.domain.entities.Address;

public interface AddressRepository {
    Address save(Address address);

    List<Address> findAll();

    Optional<Address> findById(Long id);

    List<Address> findByCity(String city);

    List<Address> findByState(String state);

    List<Address> findByCountry(String country);

    Address updateAddress(Address address, Long id);
}
