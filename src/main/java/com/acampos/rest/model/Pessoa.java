package com.acampos.rest.model;

import lombok.Data;

@Data
public class Pessoa {

    private Integer idPessoa;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;

    public Pessoa(String nome, String dataNascimento, String cpf, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public Pessoa() {}
}
