package com.william.hexagonal.config;

import com.william.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.william.hexagonal.adapters.out.InsertCustomerAdapter;
import com.william.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.william.hexagonal.application.core.useCase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
