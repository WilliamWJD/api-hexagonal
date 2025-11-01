package com.william.hexagonal.application.core.useCase;

import com.william.hexagonal.application.core.domain.Customer;
import com.william.hexagonal.application.core.exceptions.ObjectNotFoundException;
import com.william.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.william.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new ObjectNotFoundException("Customer not found"));
    }
}
