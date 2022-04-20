package com.atmosware.unittest;

import com.atmosware.unittest.business.PaymentManager;
import com.atmosware.unittest.business.PaymentService;
import com.atmosware.unittest.core.exceptions.BusinessException;
import com.atmosware.unittest.entities.requests.CreditCardRequest;
import com.atmosware.unittest.entities.requests.CustomerRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.LocalDate;

public class PaymentServicesTest {

    @InjectMocks
    PaymentService paymentService;

    @Test
    public void add_payment_test() {
        CreditCardRequest creditCardRequest = new CreditCardRequest("Hakan","1234","123", LocalDate.now().plusDays(100));
        CustomerRequest customerRequest = new CustomerRequest(1,"Hakan","Durmaz");

        Executable executable = () -> paymentService.makePayment(creditCardRequest,customerRequest,100);
        Assertions.assertThrows(BusinessException.class,executable);
    }
}
