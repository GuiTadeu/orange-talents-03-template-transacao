package com.orange.transaction.card;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class CardTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionId;
    private String establishmentName;
    private String establishmentCity;
    private String establishmentAddress;
    private String cardNumber;
    private String email;
    private BigDecimal value;
    private LocalDateTime createdAt;

    public CardTransaction() {
    }

    public CardTransaction(String transactionId, String establishmentName, String establishmentCity,
                           String establishmentAddress, String cardNumber, String email, BigDecimal value, LocalDateTime createdAt) {
        this.transactionId = transactionId;
        this.establishmentName = establishmentName;
        this.establishmentCity = establishmentCity;
        this.establishmentAddress = establishmentAddress;
        this.cardNumber = cardNumber;
        this.email = email;
        this.value = value;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public String getEstablishmentCity() {
        return establishmentCity;
    }

    public String getEstablishmentAddress() {
        return establishmentAddress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
