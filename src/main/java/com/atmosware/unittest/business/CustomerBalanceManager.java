package com.atmosware.unittest.business;

import com.atmosware.unittest.core.exceptions.BusinessException;
import com.atmosware.unittest.entities.sourceEntity.CustomerBalance;

import java.util.ArrayList;
import java.util.List;

public class CustomerBalanceManager implements CustomerBalanceService {

    public List<CustomerBalance> customerBalanceList = new ArrayList<>();

    public CustomerBalanceManager() {
        customerBalanceList.add(CustomerBalance.builder().customerId(1).balance(100).build());
        customerBalanceList.add(CustomerBalance.builder().customerId(2).balance(200).build());
        customerBalanceList.add(CustomerBalance.builder().customerId(3).balance(300).build());
    }

    @Override
    public void checkIfPaymentVerify(int customerId, double payment) {
        for (CustomerBalance customerBalance:customerBalanceList) {
            if(!(customerBalance.getCustomerId() == customerId && customerBalance.getBalance() > payment)) {
                throw new BusinessException("fakir");
            }
        }
    }
}
