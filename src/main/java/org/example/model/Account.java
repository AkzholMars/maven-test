package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@ToString

public class Account {

    private BigDecimal accountNumber;
    private BigDecimal currency;

}
