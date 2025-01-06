package com.br.consulta.cep.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponseL {

    private String street;
    private String district;
    private String state;
    private String city;
    private String cep;


}
