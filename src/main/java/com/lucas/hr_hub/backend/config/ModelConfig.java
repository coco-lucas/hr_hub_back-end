package com.lucas.hr_hub.backend.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lucas.hr_hub.backend.address.domain.Address;
import com.lucas.hr_hub.backend.address.dto.UpdateAddressDTO;

@Configuration
public class ModelConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Adicionado para evitar criar uma nova entidade ao fazer um PUT
        modelMapper.typeMap(UpdateAddressDTO.class, Address.class)
                .addMappings(mapper -> mapper.skip(Address::setId));

        return new ModelMapper();
    }
}
