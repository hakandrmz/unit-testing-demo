package com.atmosware.unittest.business;

import com.atmosware.unittest.core.exceptions.BusinessException;

import java.time.LocalDate;

public class CreditCardManager implements CreditCardService{

    public CreditCardManager() {
    }

    @Override
    public void checkIfExpirationDateIsValid(LocalDate localDate) {
        if(LocalDate.now().isAfter(localDate) || LocalDate.now().equals(localDate)) {
            throw new BusinessException("kartı yenile");
        }
    }
}
