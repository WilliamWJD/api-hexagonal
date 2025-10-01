package com.william.hexagonal.application.ports.out;

public interface DeleteCustomerOutputPort {

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteBydId(String id);
}
