package com.lucas.hr_hub.backend.infrastructure.external;

import com.lucas.hr_hub.backend.domain.entities.Address;

public interface ProcessAddressInterface {

    public Address getAddressByCEP(String CEP);
}
