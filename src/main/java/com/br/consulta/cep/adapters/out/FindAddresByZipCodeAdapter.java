package com.br.consulta.cep.adapters.out;

import com.br.consulta.cep.adapters.out.client.FindAddressByZipCodeClient;
import com.br.consulta.cep.adapters.out.client.mapper.AddressResponseMapper;
import org.openapitools.model.AddressResponse;
import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddresByZipCodeAdapter implements FindAddresByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

//    public FindAddresByZipCodeAdapter(FindAddresByZipCodeClient findAddresByZipCodeClient, AddressResponseMapper addressResponseMapper) {
//        this.findAddresByZipCodeClient = findAddresByZipCodeClient;
//        this.addressResponseMapper = addressResponseMapper;
//    }

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
