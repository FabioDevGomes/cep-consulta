package com.br.consulta.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = {"com.br.consulta.cep.adapters.out.client.mapper"})
public class MsConsultaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsultaCepApplication.class, args);
	}

}
