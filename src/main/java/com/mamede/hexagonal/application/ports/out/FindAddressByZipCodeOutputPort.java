package com.mamede.hexagonal.application.ports.out;

import com.mamede.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
