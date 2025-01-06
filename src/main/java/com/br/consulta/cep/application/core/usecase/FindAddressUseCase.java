package com.br.consulta.cep.application.core.usecase;

import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutpudPort;

public class FindAddressUseCase implements FindAddressInputPort {

    private FindAddresByZipCodeOutputPort addressOutputPort;
    private PersistLogOutpudPort persistLogOutpudPort;

    public FindAddressUseCase(FindAddresByZipCodeOutputPort addressOutputPort, PersistLogOutpudPort persistOutputPort) {
        this.addressOutputPort = addressOutputPort;
        this.persistLogOutpudPort = persistOutputPort;
    }

    @Override
    public Address find(String zipCode){
        Address address = addressOutputPort.find(zipCode);

        LogPersist log = new LogPersist();
        //preencher objeto

//        persistLogOutpudPort.insert(log);

        return address;
    }
}
