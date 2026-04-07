package com.pratu.txnengine.service;

import com.pratu.txnengine.entity.*;
import com.pratu.txnengine.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class PaymentService {

    private final TransactionRepository transactionRepository;

    public PaymentService(TransactionRepository transactionRepository)
    {
        this.transactionRepository = transactionRepository;
    }

    public Transaction createPayment(String userId, BigDecimal amount){

        Transaction txn =  Transaction.builder()
                .userId(userId)
                .Amount(amount)
                .status(TransactionStatus.PENDING)
                .retryCount(0)
                .createdAt(LocalDateTime.now())
                .build();

        return transactionRepository.save(txn);

     }
}
