package com.atmosware.unittest.business;

import com.atmosware.unittest.entities.sourceEntity.Customer;

public interface CustomerService {
    void checkIfCustomerNotExist(Customer customer);
}
