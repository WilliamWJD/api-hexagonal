package com.william.hexagonal.application.ports.in;

import com.william.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    /**
     * Insert.
     *
     * @param customer the customer
     * @param zipCode  the zip code
     */
    void insert(Customer customer, String zipCode);
}
