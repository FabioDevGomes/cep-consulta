package com.br.consulta.cep.adapters.out.client.repository;

import com.br.consulta.cep.adapters.out.client.repository.entity.LogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<LogEntity, String> {
}
