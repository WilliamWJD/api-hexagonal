package com.william.hexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {

    /**
     * Send.
     *
     * @param cpf the cpf
     */
    void send(String cpf);
}
