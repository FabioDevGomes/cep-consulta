package com.br.consulta.cep.adapters.out.client.mapper;

import com.br.consulta.cep.adapters.out.client.repository.entity.LogEntity;
import com.br.consulta.cep.application.core.domain.LogPersist;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface LogEntityMapper {

    LogEntity toEntity(LogPersist logPersist);

}
