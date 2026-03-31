package com.pratu.txnengine.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String userId;

    private BigDecimal Amount;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    private int retryCount;

    private LocalDateTime createdAt;

}
