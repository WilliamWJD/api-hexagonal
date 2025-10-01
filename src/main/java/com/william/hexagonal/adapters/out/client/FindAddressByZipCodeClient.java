package com.william.hexagonal.adapters.out.client;

import com.william.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${arantes.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    /**
     * Find address response.
     *
     * @param zipCode the zip code
     * @return the address response
     */
    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode")  String zipCode);
}
