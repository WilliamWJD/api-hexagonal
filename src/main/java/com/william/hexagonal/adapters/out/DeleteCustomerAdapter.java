package com.william.hexagonal.adapters.out;

import com.william.hexagonal.adapters.out.repository.CustomerRepository;
import com.william.hexagonal.application.ports.out.DeleteCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteCustomerAdapter implements DeleteCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void deleteBydId(String id) {
        customerRepository.deleteById(id);
    }
}
