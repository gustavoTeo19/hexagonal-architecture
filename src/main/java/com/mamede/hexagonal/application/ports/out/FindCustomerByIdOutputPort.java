package com.mamede.hexagonal.application.ports.out;

import com.mamede.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
