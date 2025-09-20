package com.mamede.hexagonal.application.core.usecase;

import com.mamede.hexagonal.application.core.domain.Customer;
import com.mamede.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.mamede.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
