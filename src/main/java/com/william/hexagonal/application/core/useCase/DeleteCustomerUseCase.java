package com.william.hexagonal.application.core.useCase;

import com.william.hexagonal.application.ports.in.DeleteCustomerInputPort;
import com.william.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.william.hexagonal.application.ports.out.DeleteCustomerOutputPort;

public class DeleteCustomerUseCase implements DeleteCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final DeleteCustomerOutputPort deleteCustomerOutputPort;

    public DeleteCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerOutputPort deleteCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerOutputPort.deleteBydId(id);
    }
}
