package com.br.consulta.cep.adapters.out;

import com.br.consulta.cep.adapters.out.client.mapper.LogEntityMapper;
import com.br.consulta.cep.adapters.out.client.repository.LogRepository;
import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutpudPort;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        logPersist.setRetornoApi(createJsonLog(logPersist.getAddress()));
        logRepository.insert(logEntityMapper.toEntity(logPersist));
    }

    private static String createJsonLog(Address address) {
        String json = null;
        ObjectMapper Obj = new ObjectMapper();

        try {
            json = Obj.writeValueAsString(address);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }
}
