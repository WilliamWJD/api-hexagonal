package com.william.hexagonal.application.config;

import com.william.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.william.hexagonal.application.core.useCase.DeleteCustomerByIdUseCase;
import com.william.hexagonal.application.core.useCase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdAdapter,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdAdapter, deleteCustomerByIdAdapter);
    }
}
