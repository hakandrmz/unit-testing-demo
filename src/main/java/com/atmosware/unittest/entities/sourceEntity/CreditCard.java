package com.atmosware.unittest.entities.sourceEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard{
    private String cardHolder;
    private String cardNumber;
    private String csv;
    private LocalDate expiration;
}
