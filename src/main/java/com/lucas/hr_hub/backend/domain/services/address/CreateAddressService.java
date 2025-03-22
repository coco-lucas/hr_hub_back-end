package com.lucas.hr_hub.backend.domain.services.address;

import com.lucas.hr_hub.backend.domain.entities.Address;
import com.lucas.hr_hub.backend.infra.external.processCep.ProcessCepInterface;

public class CreateAddressService {

    private final ProcessCepInterface processCep;

    public CreateAddressService(ProcessCepInterface processCep) {
        this.processCep = processCep;
    }

    public Address execute(Address address) {
        if (address.getCountry().equalsIgnoreCase("Brazil") ||
                address.getCountry().equalsIgnoreCase("Brasil")) {
            address = handleBrazilianAddress(address);
        }
        return address;
    }

    private Address handleBrazilianAddress(Address address) {
        address = processCep.getAddressByCEP(address.getZIPcode());
        address.setUser(address.getUser());
        address.setHouseNum(address.getHouseNum());
        address.setCountry(address.getCountry());

        return address;
    }
}