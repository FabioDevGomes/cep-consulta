package com.br.consulta.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableFeignClients
@EnableMongoRepositories
@SpringBootApplication
public class MsConsultaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsultaCepApplication.class, args);
	}

}
