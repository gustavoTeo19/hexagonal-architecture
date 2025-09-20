package com.mamede.hexagonal.application.ports.in;

import com.mamede.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
