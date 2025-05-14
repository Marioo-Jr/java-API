package com.Api.Trabalho02;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface Transacao_Repository extends JpaRepository<Transacao_Entity, Long> {
    List<Transacao_Entity> findByUsuarioId(Long usuarioId);     }


