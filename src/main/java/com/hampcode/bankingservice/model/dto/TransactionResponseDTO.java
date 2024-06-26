package com.hampcode.bankingservice.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDTO {
    private Long id;
    private AccountResponseDTO targetAccount;
    private BigDecimal amount;
    private String description;
    private String transactionDate;

}
