package com.orange.transaction.card;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {

    List<CardTransaction> findByCardNumber(String cardNumber, Pageable pageable);

}
