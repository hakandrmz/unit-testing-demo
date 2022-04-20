package com.atmosware.unittest.entities.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardRequest {
    private String cardHolder;
    private String cardNumber;
    private String csv;
    private LocalDate expiration;
}
