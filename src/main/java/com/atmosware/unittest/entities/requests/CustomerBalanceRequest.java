package com.atmosware.unittest.entities.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBalanceRequest{
    private int id;
    private int customerId;
    private double balance;
}
