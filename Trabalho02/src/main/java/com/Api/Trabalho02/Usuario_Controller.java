package com.Api.Trabalho02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Usuario_Controller {

    @Autowired
    Usuario_Service usuarioService;

    @PostMapping
    public ResponseEntity<Usuario_Entity> criarUsuario(@RequestBody Usuario_Entity usuario) {
        Usuario_Entity novoUsuario = usuarioService.criarUsuario(usuario);
        return ResponseEntity.status(201).body(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<Usuario_Entity>> listarUsuarios() {
        List<Usuario_Entity> usuarios = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }


    @GetMapping("/{id}/saldo")
    public ResponseEntity<BigDecimal> consultarSaldo(@PathVariable Long id) {
        BigDecimal saldo = usuarioService.consultarSaldo(id);
        return ResponseEntity.ok(saldo);
    }

    @PostMapping("/{id}/deposito")
    public ResponseEntity<BigDecimal> depositar(
        @PathVariable Long id,
        @RequestBody BigDecimal valor) {
    BigDecimal novo = usuarioService.depositar(id, valor);
    return ResponseEntity.ok(novo);
}



}
