package com.lucas.hr_hub.backend.infra.external.processCep;

import com.lucas.hr_hub.backend.domain.entities.Address;

public interface ProcessCepInterface {

    public Address getAddressByCEP(String CEP);
}
