package com.br.consulta.cep.application.ports.out.client;

import com.br.consulta.cep.application.core.domain.Address;

import java.util.Optional;


public interface FindAddresByZipCodeOutputPort {

    Optional<Address> find(String zipCode);

}
