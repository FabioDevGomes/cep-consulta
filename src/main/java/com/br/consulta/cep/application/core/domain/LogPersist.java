package com.br.consulta.cep.application.core.domain;

import java.time.LocalDateTime;


public class LogPersist {

    private String id;
    private LocalDateTime horaConsulta;
    private String retornoApi;
    private Address address;

    public String getRetornoApi() {
        return retornoApi;
    }

    public void setRetornoApi(String retornoApi) {
        this.retornoApi = retornoApi;
    }

    public LocalDateTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalDateTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
