package com.Api.Trabalho02;


import jakarta.persistence.*;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Entity
@Table(name = "usuario")
public class Usuario_Entity {



        @Id
        @GeneratedValue
        private Long id;
        private String nome;
        private String cpf;
        private BigDecimal saldo;



        public Usuario_Entity() {

        }

        public Usuario_Entity(Long id, String nome, String cpf) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
        }

        public Long getId() {
            return id;
        }

    public String getCpf() {
            return cpf;
        }

    public String getNome() {
            return nome;
        }

    public BigDecimal getSaldo() {
            return saldo;
    }

    public void setSaldo(BigDecimal zero) {
    }


}
