package com.william.hexagonal.application.ports.in;

import com.william.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    /**
     * Find customer.
     *
     * @param id the id
     * @return the customer
     */
    Customer find(String id);
}
