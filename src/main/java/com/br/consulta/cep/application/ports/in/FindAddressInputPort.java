package com.br.consulta.cep.application.ports.in;

import com.br.consulta.cep.application.core.domain.Address;


public interface FindAddressInputPort {

    Address find(String zipcode);
}
