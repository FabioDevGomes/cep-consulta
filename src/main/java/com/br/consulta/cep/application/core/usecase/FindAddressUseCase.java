package com.br.consulta.cep.application.core.usecase;

import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutpudPort;

import java.time.LocalDateTime;

public class FindAddressUseCase implements FindAddressInputPort {

    private FindAddresByZipCodeOutputPort addressOutputPort;
    private PersistLogOutpudPort persistLogOutpudPort;

    public FindAddressUseCase(FindAddresByZipCodeOutputPort addressOutputPort, PersistLogOutpudPort persistOutputPort) {
        this.addressOutputPort = addressOutputPort;
        this.persistLogOutpudPort = persistOutputPort;
    }

    @Override
    public Address find(String zipCode){
        Address address = addressOutputPort.find(zipCode).orElseThrow(() -> new RuntimeException("CEP not found"));

        LogPersist log = new LogPersist();
        log.setHoraConsulta(LocalDateTime.now());
        log.setAddress(address);

        persistLogOutpudPort.insert(log);

        return address;
    }
}
