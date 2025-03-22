package com.lucas.hr_hub.backend.interfaceAdapters.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.hr_hub.backend.application.dtos.AddressDTO;
import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.application.useCases.address.AddressService;
import com.lucas.hr_hub.backend.application.useCases.address.CreateAddressUseCase;
import com.lucas.hr_hub.backend.application.useCases.address.GetAllAddressUseCase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final CreateAddressUseCase createAddressUseCase;
    private final GetAllAddressUseCase getAllAddressUseCase;

    public AddressController(
            CreateAddressUseCase createAddressUseCase,
            GetAllAddressUseCase getAllAddressUseCase) {
        this.createAddressUseCase = createAddressUseCase;
        this.getAllAddressUseCase = getAllAddressUseCase;
    }

    @GetMapping
    public ResponseEntity<List<AddressDTO>> getAllAddress() {
        return ResponseEntity.ok(service.getAllAddress());
    }

    @PostMapping
    public ResponseEntity<AddressDTO> createNewAddress(@RequestBody CreateAddressDTO dto) {
        AddressDTO createdDto = service.createAddress(dto);

        return ResponseEntity.ok(createdDto);
    }
    // @PutMapping("/{id}")
    // public ResponseEntity<AddressDTO> putMethodName(@PathVariable Long id,
    // @RequestBody UpdateAddressDTO dto) {

    // return entity;
    // }

}
