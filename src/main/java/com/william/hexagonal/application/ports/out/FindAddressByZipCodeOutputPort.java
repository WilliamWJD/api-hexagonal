package com.william.hexagonal.application.ports.out;

import com.william.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    /**
     * Find address.
     *
     * @param zipCode the zip code
     * @return the address
     */
    Address find(String zipCode);
}
