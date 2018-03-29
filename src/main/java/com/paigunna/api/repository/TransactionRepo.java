package com.paigunna.api.repository;

import com.paigunna.api.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {
}
