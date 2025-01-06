package com.br.consulta.cep.application.ports.out.client;

import com.br.consulta.cep.application.core.domain.Address;


public interface FindAddresByZipCodeOutputPort {

    Address find(String zipCode);

}
