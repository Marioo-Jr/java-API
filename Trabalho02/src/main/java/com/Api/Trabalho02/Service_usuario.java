package com.Api.Trabalho02;


import org.springframework.stereotype.Service;

@Service
public class Service_usuario {

    private  final Repository_usuario repo_usuario;
    private final Repository_conta repo_conta;

    public Service_usuario(Repository_usuario repo_usuario, Repository_conta repo_conta) {
        this.repo_usuario = repo_usuario;
        this.repo_conta = repo_conta;
    }

    public Repository_usuario getRepo_usuario() {
        return repo_usuario;
    }



    public Repository_conta getRepo_conta() {
        return repo_conta;
    }

    public Entity_usuario cadastrarUsuario(Entity_usuario usuario) {
        return repo_usuario.save(usuario);
    }




}
