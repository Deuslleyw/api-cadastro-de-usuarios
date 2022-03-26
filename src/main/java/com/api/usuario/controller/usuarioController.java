package com.api.usuario.controller;

import com.api.usuario.entidade.Usuario;
import com.api.usuario.repository.UsuarioRepository;
import com.api.usuario.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {

    @Autowired
    private UsuarioService service;


    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Usuario user) {
        System.out.println(user);

        service.saveUser(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

   @GetMapping
 public ResponseEntity <List<Usuario>>  getAll(){
        List<Usuario> usuarios = service.obterUsuario();

        return ResponseEntity.ok(usuarios);
 }
}
