package com.atmosware.unittest.entities.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    private int id;
    private double total;
    private int customerId;
    private int transactionId;
    private LocalDate date;
}
