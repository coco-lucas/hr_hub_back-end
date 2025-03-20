package com.lucas.hr_hub.backend.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.hr_hub.backend.domain.entities.Address;

@Repository
public interface JpaAddressRepository extends JpaRepository<Address, Long> {

}
