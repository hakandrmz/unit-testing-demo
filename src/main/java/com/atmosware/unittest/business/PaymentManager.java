package com.atmosware.unittest.business;

import com.atmosware.unittest.core.exceptions.BusinessException;
import com.atmosware.unittest.entities.requests.CreditCardRequest;
import com.atmosware.unittest.entities.requests.CustomerRequest;
import com.atmosware.unittest.entities.sourceEntity.Customer;
import com.atmosware.unittest.entities.sourceEntity.CustomerBalance;
import com.atmosware.unittest.entities.sourceEntity.Payment;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentService{

    public List<Payment> paymentList = new ArrayList<>();

    private CustomerService customerService;
    private CreditCardService creditCardService;
    private CustomerBalanceService customerBalanceService;

    @Autowired
    public PaymentManager(CustomerService customerService, CreditCardService creditCardService, CustomerBalanceService customerBalanceService) {
        this.customerService = customerService;
        this.creditCardService = creditCardService;
        this.customerBalanceService = customerBalanceService;
    }

    public PaymentManager() {

    }

    @Override
    public void makePayment(CreditCardRequest creditCardRequest, CustomerRequest customerRequest,int balance) {
       customerService.checkIfCustomerNotExist(Customer.builder()
              .id(customerRequest.getId())
              .firstName(customerRequest.getFirstName())
              .lastName(customerRequest.getLastName())
              .build());

       customerBalanceService.checkIfPaymentVerify(customerRequest.getId(),balance);
       creditCardService.checkIfExpirationDateIsValid(creditCardRequest.getExpiration());
        paymentList.add(new Payment(1,balance,customerRequest.getId(),1, LocalDate.now()));
    }
}
