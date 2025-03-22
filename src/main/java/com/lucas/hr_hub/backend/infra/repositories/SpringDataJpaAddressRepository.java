package com.lucas.hr_hub.backend.infrastructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hr_hub.backend.domain.entities.Address;

public interface SpringDataJpaAddressRepository extends JpaRepository<Address, Long> {

}
