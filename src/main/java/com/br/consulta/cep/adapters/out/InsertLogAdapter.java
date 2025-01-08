package com.br.consulta.cep.adapters.out;

import com.br.consulta.cep.adapters.out.client.mapper.LogEntityMapper;
import com.br.consulta.cep.adapters.out.client.repository.LogRepository;
import com.br.consulta.cep.application.core.domain.Address;
import com.br.consulta.cep.application.core.domain.LogPersist;
import com.br.consulta.cep.application.ports.out.repository.PersistLogOutputPort;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class InsertLogAdapter implements PersistLogOutputPort {

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private LogEntityMapper logEntityMapper;

    Logger logger = LoggerFactory.getLogger(InsertLogAdapter.class);

    @Override
    public void insert(LogPersist logPersist) {
        logPersist.setRetornoApi(createJsonLog(logPersist.getAddress()));
        logRepository.insert(logEntityMapper.toEntity(logPersist));
    }

    private String createJsonLog(Address address) {
        String json = null;
        ObjectMapper Obj = new ObjectMapper();

        try {
            json = Obj.writeValueAsString(address);
        } catch (JsonProcessingException e) {
            logger.error("Error convert object");
            e.printStackTrace();
        }

        return json;
    }
}
