package com.william.hexagonal.config;

import com.william.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.william.hexagonal.application.core.useCase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase  findCustomerByIdUseCase(
            FindCustomerByIdAdapter FindCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(FindCustomerByIdAdapter);
    }
}
