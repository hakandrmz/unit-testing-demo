package com.atmosware.unittest.business;

import java.time.LocalDate;

public interface CreditCardService {
    void checkIfExpirationDateIsValid(LocalDate localDate);
}
