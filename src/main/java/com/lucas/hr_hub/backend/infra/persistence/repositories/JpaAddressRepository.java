package com.lucas.hr_hub.backend.infra.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.hr_hub.backend.infra.persistence.entities.AddressEntity;
import java.util.List;

@Repository
public interface JpaAddressRepository extends JpaRepository<AddressEntity, Long> {
    List<AddressEntity> findByCountry(String country);

    List<AddressEntity> findByCity(String city);

    List<AddressEntity> findByState(String state);
}