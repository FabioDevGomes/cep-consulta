package com.br.consulta.cep.adapters.out;

import com.br.consulta.cep.adapters.out.client.mapper.LogEntityMapper;
import com.br.consulta.cep.adapters.out.client.repository.LogRepository;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutpudPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertLogAdapter implements PersistLogOutpudPort {

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private LogEntityMapper logEntityMapper;


    @Override
    public void insert(LogPersist logPersist) {
//        logRepository.insert(logEntityMapper.toEntity(logPersist));
    }
}
