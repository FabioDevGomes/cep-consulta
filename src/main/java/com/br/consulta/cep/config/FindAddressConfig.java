package com.br.consulta.cep.config;


import com.br.consulta.cep.adapters.out.FindAddresByZipCodeAdapter;
import com.br.consulta.cep.adapters.out.InsertLogAdapter;
import com.br.consulta.cep.adapters.out.client.FindAddressByZipCodeClient;
import com.br.consulta.cep.adapters.out.client.mapper.AddressResponseMapper;
import com.br.consulta.cep.application.core.usecase.FindAddressUseCase;
import com.br.consulta.cep.application.ports.in.FindAddressInputPort;
import com.br.consulta.cep.application.ports.out.client.FindAddresByZipCodeOutputPort;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutpudPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAddressConfig {

    @Bean
    public FindAddressUseCase findAddressUseCase(
            FindAddresByZipCodeAdapter findAddresByZipCodeAdapter,
            InsertLogAdapter insertLogAdapter
            ){
        return new FindAddressUseCase(findAddresByZipCodeAdapter, insertLogAdapter);
    }

//    @Bean
//    public FindAddresByZipCodeAdapter findAddresByZipCodeAdapter(
//            FindAddresByZipCodeClient findAddresByZipCodeClient,
//            AddressResponseMapper addressResponseMapper
//            ){
//        return new FindAddresByZipCodeAdapter(findAddresByZipCodeClient, addressResponseMapper);
//    }

}
