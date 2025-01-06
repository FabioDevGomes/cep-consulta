package com.br.consulta.cep.adapters.out.client.mapper;

import org.openapitools.model.AddressResponse;
import com.br.consulta.cep.application.core.domain.Address;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
