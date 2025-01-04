package com.br.consulta.cep.adapters.in.controller;


import org.openapitools.model.EddressResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.openapitools.api.*;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CepController implements CepSearchApi{

    @Override
    public ResponseEntity<EddressResponse> cepSearchCepGet(String cep) {

        return new ResponseEntity<>(new EddressResponse(), HttpStatus.OK);
    }
}
