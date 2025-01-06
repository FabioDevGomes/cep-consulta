package com.br.consulta.cep.adapters.in.controller;


import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import org.openapitools.model.AddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.openapitools.api.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CepController implements CepSearchApi{

    @Autowired
    private FindAddressInputPort findAddressInputPort;

    @Override
    public ResponseEntity<AddressResponse> cepSearchCepGet(String cep) {

        findAddressInputPort.find(cep);

        return new ResponseEntity<>(new AddressResponse(), HttpStatus.OK);
    }
}
