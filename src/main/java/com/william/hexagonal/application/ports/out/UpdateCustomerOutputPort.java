package com.william.hexagonal.application.ports.out;

import com.william.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    /**
     * Update.
     *
     * @param customer the customer
     */
    void update(Customer customer);
}
