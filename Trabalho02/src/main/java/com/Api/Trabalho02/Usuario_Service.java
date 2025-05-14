package com.Api.Trabalho02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class Usuario_Service {


    @Autowired
    private Usuario_Repository usuario_repository;

    public Usuario_Entity criarUsuario(Usuario_Entity usuario) {
        if (usuario.getNome() == null || usuario.getCpf() == null) {
            throw new IllegalArgumentException("Nome e CPF são obrigatórios");
        }

        usuario.setSaldo(BigDecimal.ZERO);
        return usuario_repository.save(usuario);

    }
    public List<Usuario_Entity> listarUsuarios() {
        return usuario_repository.findAll();




    }

    public BigDecimal consultarSaldo(Long id) {
    Usuario_Entity usuario = usuario_repository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

    return usuario.getSaldo();
    }

    public BigDecimal depositar(Long id, BigDecimal valor) {
        // 1) validação simples
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }


        Usuario_Entity usuario = usuario_repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));


        BigDecimal novoSaldo = usuario.getSaldo().add(valor);
        usuario.setSaldo(novoSaldo);
        usuario_repository.save(usuario);

        return novoSaldo;
    }






}
