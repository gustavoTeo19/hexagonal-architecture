package com.mamede.hexagonal.adapters.out.client.mapper;

import com.mamede.hexagonal.adapters.out.client.response.AddressResponse;
import com.mamede.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
