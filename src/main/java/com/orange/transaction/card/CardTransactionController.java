package com.orange.transaction.card;

import com.orange.transaction.exception.NotFoundException;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards/")
public class CardTransactionController {

    private final CardTransactionRepository transactionRepository;

    public CardTransactionController(CardTransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/{cardNumber}")
    public List<CardTransaction> getTransactions(@PathVariable String cardNumber) {
        List<CardTransaction> transactions = transactionRepository.findByCardNumber(cardNumber, PageRequest.of(0, 10));
        if(transactions.isEmpty()) throw new NotFoundException();

        return transactions;
    }
}
