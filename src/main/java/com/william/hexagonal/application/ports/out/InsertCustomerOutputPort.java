package com.william.hexagonal.application.ports.out;

import com.william.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    /**
     * Insert.
     *
     * @param customer the customer
     */
    void insert(Customer customer);
}
