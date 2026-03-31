package com.pratu.txnengine.repository;

import com.pratu.txnengine.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
