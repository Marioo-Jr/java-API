package com.Api.Trabalho02;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "usuario")
public class Entity_usuario {



        @Id
        @GeneratedValue
        private Long id;
        private String nome;
        private String cpf;


        public Entity_usuario() {

        }

        public Entity_usuario(Long id,String nome, String cpf) {
            this.id = id;
            this.nome = nome;
            this.cpf = cpf;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        @OneToOne(mappedBy = "Entity_conta", cascade = CascadeType.ALL)
        private Entitiy_conta conta;


}
