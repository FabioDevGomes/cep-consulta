package com.br.consulta.cep.adapters.out;

import com.br.consulta.cep.adapters.out.client.FindAddressByZipCodeClient;
import com.br.consulta.cep.adapters.out.client.mapper.AddressResponseMapper;
import org.openapitools.model.AddressResponse;
import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindAddresByZipCodeAdapter implements FindAddresByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Optional<Address> find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        Optional<Address> opt = Optional.ofNullable(addressResponseMapper.toAddress(addressResponse));

        return opt;
    }
}
