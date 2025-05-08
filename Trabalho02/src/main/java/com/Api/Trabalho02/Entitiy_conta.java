package com.Api.Trabalho02;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.math.BigDecimal;

public class Entitiy_conta {

    private String conta;
    private BigDecimal saldo;


public Entitiy_conta() {}




    public Entitiy_conta(BigDecimal salario,  String conta) {
        this.conta = conta;
        this.saldo = salario;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Entity_usuario usuario;
}
