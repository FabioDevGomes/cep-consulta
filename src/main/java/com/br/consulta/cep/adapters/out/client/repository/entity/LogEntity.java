package com.br.consulta.cep.adapters.out.client.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;

@Data
@Document(collection = "log")
public class LogEntity {

    @Id
    private String id;
    private LocalDateTime horaConsulta;
    private String retornoApi;


}
