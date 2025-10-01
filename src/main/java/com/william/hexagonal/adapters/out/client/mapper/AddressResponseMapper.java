package com.william.hexagonal.adapters.out.client.mapper;

import com.william.hexagonal.adapters.out.client.response.AddressResponse;
import com.william.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
