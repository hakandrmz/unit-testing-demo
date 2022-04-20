package com.atmosware.unittest.entities.sourceEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int id;
    private double total;
    private int customerId;
    private int transactionId;
    private LocalDate date;
}
