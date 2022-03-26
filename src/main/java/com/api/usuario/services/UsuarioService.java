package com.api.usuario.services;

import com.api.usuario.entidade.Usuario;
import com.api.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario saveUser(Usuario usuario ){
       Usuario result =  repository.save(usuario);
     return result;

    }
  public List<Usuario> obterUsuario(){
    return  repository.findAll();

  }
}
