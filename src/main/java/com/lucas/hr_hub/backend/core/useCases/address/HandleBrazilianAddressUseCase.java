package com.lucas.hr_hub.backend.application.useCases.address;

import com.lucas.hr_hub.backend.application.dtos.CreateAddressDTO;
import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.infrastructure.external.processCep.ProcessCepInterface;

public class HandleBrazilianAddressUseCase {
    private ProcessCepInterface cepInterface;

    public HandleBrazilianAddressUseCase(ProcessCepInterface cepInterface) {
        this.cepInterface = cepInterface;
    }

    public Address execute(CreateAddressDTO dto) {
        Address address = cepInterface.getAddressByCEP(dto.getZIPcode());
        address.setUser(address.getUser());
        address.setHouseNum(address.getHouseNum());
        address.setCountry(address.getCountry());

        return address;
    }
}
