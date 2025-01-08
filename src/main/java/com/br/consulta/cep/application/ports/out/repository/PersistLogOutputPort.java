package com.br.consulta.cep.application.ports.out.repository;

import com.br.consulta.cep.application.core.domain.LogPersist;

public interface PersistLogOutputPort {

    public void insert(LogPersist logPersist);
}
