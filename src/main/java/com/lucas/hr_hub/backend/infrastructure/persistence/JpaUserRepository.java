package com.lucas.hr_hub.backend.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hr_hub.backend.domain.entities.User;

public interface JpaUserRepository extends JpaRepository<User, Long> {

}
