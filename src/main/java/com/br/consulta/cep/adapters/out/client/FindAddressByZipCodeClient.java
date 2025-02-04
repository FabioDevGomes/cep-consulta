package com.br.consulta.cep.adapters.out.client;


import org.openapitools.model.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipcode}")
    AddressResponse find(@PathVariable("zipcode") String zipcode);
}
