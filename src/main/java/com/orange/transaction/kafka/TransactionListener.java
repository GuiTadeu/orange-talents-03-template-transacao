package com.orange.transaction.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void consume(TransactionEvent transactionEvent) {
        System.out.println("PRINT -------------> " + transactionEvent);
    }
}
