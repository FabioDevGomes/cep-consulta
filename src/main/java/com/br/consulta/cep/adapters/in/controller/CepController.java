package com.br.consulta.cep.adapters.in.controller;


import com.br.consulta.cep.adapters.out.client.mapper.AddressResponseMapper;
import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import org.openapitools.model.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.openapitools.api.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CepController implements SearchApi{

    @Autowired
    private FindAddressInputPort findAddressInputPort;

    @Autowired
    private AddressResponseMapper mapper;

    @Override
    public ResponseEntity<AddressResponse> searchCepGet(String cep) {
        AddressResponse response = mapper.toAddressResponse(findAddressInputPort.find(cep));

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
