package com.william.hexagonal.application.ports.out;

import com.william.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    /**
     * Find optional.
     *
     * @param id the id
     * @return the optional
     */
    Optional<Customer> find(String id);
}
