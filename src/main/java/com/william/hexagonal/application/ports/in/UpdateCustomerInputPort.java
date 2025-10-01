package com.william.hexagonal.application.ports.in;

import com.william.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    /**
     * Update.
     *
     * @param customer the customer
     * @param zipCode  the zip code
     */
    void update(Customer customer, String zipCode);
}
