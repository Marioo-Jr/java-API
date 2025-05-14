package com.Api.Trabalho02;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Usuario_Repository extends JpaRepository<Usuario_Entity, Long> {
    Optional<Usuario_Entity> findByCpf(String cpf);

}
