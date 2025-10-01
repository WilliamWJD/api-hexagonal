package com.william.hexagonal.application.ports.in;

public interface DeleteCustomerInputPort {
    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(String id);
}
