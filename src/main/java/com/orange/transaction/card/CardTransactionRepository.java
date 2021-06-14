package com.orange.transaction.card;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {

    Optional<CardTransaction> findByCardNumber(String cardNumber);
    List<CardTransaction> findByCardNumber(String cardNumber, Pageable pageable);
}