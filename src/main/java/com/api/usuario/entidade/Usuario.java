package com.api.usuario.entidade;



import javax.persistence.*;
import java.time.Instant;
@Table (name = "TB_USUARIO")
@Entity

public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nome;
    private String telefone;
    private Instant nascimento;


    @OneToOne
    private Endereco endereco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Instant getNascimento() {
        return nascimento;
    }

    public void setNascimento(Instant nascimento) {
        nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
