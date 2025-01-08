package com.br.consulta.cep.application.core.usecase;

import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutputPort;

import java.time.LocalDateTime;

public class FindAddressUseCase implements FindAddressInputPort {

    private FindAddresByZipCodeOutputPort addressOutputPort;
    private PersistLogOutputPort persistLogOutputPort;

    public FindAddressUseCase(FindAddresByZipCodeOutputPort addressOutputPort, PersistLogOutputPort persistOutputPort) {
        this.addressOutputPort = addressOutputPort;
        this.persistLogOutputPort = persistOutputPort;
    }

    @Override
    public Address find(String zipCode){
        Address address = addressOutputPort.find(zipCode)
                .orElseThrow(() -> new RuntimeException("Address not found"));

        createRegisterLog(address);

        return address;
    }

    private void createRegisterLog(Address address) {
        LogPersist log = new LogPersist();
        log.setHoraConsulta(LocalDateTime.now());
        log.setAddress(address);

        persistLogOutputPort.insert(log);
    }
}
