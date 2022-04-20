package com.atmosware.unittest.business;

import com.atmosware.unittest.core.exceptions.BusinessException;
import com.atmosware.unittest.entities.sourceEntity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    public List<Customer> customerList = new ArrayList<>();

    public CustomerManager() {
        customerList.add(new Customer(1,"Alihaydar","Salman"));
        customerList.add(new Customer(2,"Hakan","Durmaz"));
        customerList.add(new Customer(3,"Yüksel","Özdemir"));
    }

    public void add(Customer customer) {
        checkIfCustomerNotExist(customer);
        customerList.add(customer);
    }

    public void checkIfCustomerNotExist(Customer customer) {
        for (Customer existCustomer: customerList) {
            if(existCustomer != customer) {
                throw new BusinessException("");
            }
        }
    }


}
