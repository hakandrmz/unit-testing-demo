package com.atmosware.unittest.business;

import com.atmosware.unittest.entities.requests.CreditCardRequest;
import com.atmosware.unittest.entities.requests.CustomerRequest;
import com.atmosware.unittest.entities.requests.PaymentRequest;
import com.atmosware.unittest.entities.sourceEntity.CreditCard;

public interface PaymentService {
    void makePayment(CreditCardRequest creditCardRequest, CustomerRequest customerRequest,int paymentjj);
}
