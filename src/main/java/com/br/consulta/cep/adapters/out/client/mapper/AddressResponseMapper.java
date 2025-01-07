package com.br.consulta.cep.adapters.out.client.mapper;

import org.openapitools.model.AddressResponse;
import com.br.consulta.cep.application.core.domain.Address;
import org.mapstruct.Mapper;

import java.util.Optional;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
