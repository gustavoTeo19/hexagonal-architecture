package com.mamede.hexagonal.application.ports.out;

import com.mamede.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);

}
