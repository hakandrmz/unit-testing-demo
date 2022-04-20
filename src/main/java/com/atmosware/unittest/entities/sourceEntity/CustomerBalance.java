package com.atmosware.unittest.entities.sourceEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerBalance{
    private int id;
    private int customerId;
    private double balance;
}
