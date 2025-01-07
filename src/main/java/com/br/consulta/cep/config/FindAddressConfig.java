package com.br.consulta.cep.config;


import com.br.consulta.cep.adapters.out.FindAddresByZipCodeAdapter;
import com.br.consulta.cep.adapters.out.InsertLogAdapter;
import com.br.consulta.cep.application.core.usecase.FindAddressUseCase;
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

}
