package com.lucas.hr_hub.backend.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.lucas.hr_hub.backend.application.dtos.AddressDTO;
import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.domain.entities.Address;

public interface AddressRepository {
    Address save(CreateAddressDTO address);

    List<AddressDTO> findAll();

    Optional<AddressDTO> findById(Long id);

    void deleteById(Long id);
}
