package com.orange.transaction.kafka;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionEvent {

    private String id;
    private BigDecimal valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

    public TransactionEvent() {
    }

    public TransactionEvent(String id, BigDecimal valor, Estabelecimento estabelecimento,
                            Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    private class Estabelecimento {

        private String nome;
        private String cidade;
        private String endereco;

        public Estabelecimento() {
        }

        public Estabelecimento(String nome, String cidade, String endereco) {
            this.nome = nome;
            this.cidade = cidade;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public String getCidade() {
            return cidade;
        }

        public String getEndereco() {
            return endereco;
        }
    }

    private class Cartao {

        private String id;
        private String email;

        public Cartao() {
        }

        public Cartao(String id, String email) {
            this.id = id;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }
    }
}
