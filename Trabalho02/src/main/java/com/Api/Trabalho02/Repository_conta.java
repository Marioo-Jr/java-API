package com.Api.Trabalho02;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository_conta extends JpaRepository<Entitiy_conta,Long> {
}


// criar um para a transacao.

//public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
//    List<Transacao> findByConta_Id(Long contaId);
//}
