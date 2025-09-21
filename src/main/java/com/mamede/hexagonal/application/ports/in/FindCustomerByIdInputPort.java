package com.mamede.hexagonal.application.ports.in;

import com.mamede.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
