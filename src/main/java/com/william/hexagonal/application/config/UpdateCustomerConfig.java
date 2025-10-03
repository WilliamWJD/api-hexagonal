package com.william.hexagonal.application.config;

import com.william.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.william.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.william.hexagonal.application.core.useCase.FindCustomerByIdUseCase;
import com.william.hexagonal.application.core.useCase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdAdapter,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdAdapter, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
