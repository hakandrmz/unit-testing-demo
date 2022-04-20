package com.atmosware.unittest.entities.sourceEntity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
}
