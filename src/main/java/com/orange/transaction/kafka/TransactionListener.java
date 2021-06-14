package com.orange.transaction.kafka;

import com.orange.transaction.card.CardTransaction;
import com.orange.transaction.card.CardTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    private final CardTransactionRepository transactionRepository;

    public TransactionListener(CardTransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void consume(TransactionEvent event) {
        transactionRepository.save(
            new CardTransaction(
                event.getId(),
                event.getNomeEstabelecimento(),
                event.getCidadeEstabelecimento(),
                event.getEnderecoEstabelecimento(),
                event.getCartaoId(),
                event.getCartaoEmail(),
                event.getValor(),
                event.getEfetivadaEm()
        ));
    }
}
