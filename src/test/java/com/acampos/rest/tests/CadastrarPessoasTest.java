package com.acampos.rest.tests;

import com.acampos.rest.model.Pessoa;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CadastrarPessoasTest extends PessoaBase {

    @Test
    public void deveCadastrarPessoaComSucesso() {
        Pessoa pessoa = pessoaDataFactory.pessoaValida();

        Pessoa pessoaCadastrada = pessoaClient.cadastrar(pessoa)
                .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().as(Pessoa.class)
        ;

        assertAll( "pessoaCadastrada",
                () -> assertEquals(pessoa.getNome(), pessoaCadastrada.getNome()),
                () -> assertEquals(pessoa.getDataNascimento(), pessoaCadastrada.getDataNascimento()),
                () -> assertEquals(pessoa.getCpf(), pessoaCadastrada.getCpf()),
                () -> assertEquals(pessoa.getEmail(), pessoaCadastrada.getEmail())
        );

        pessoaClient.excluir(pessoaCadastrada.getIdPessoa())
                .then()
                        .statusCode(HttpStatus.SC_OK);
    }
}
