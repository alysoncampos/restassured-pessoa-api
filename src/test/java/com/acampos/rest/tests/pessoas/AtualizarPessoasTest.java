package com.acampos.rest.tests.pessoas;

import com.acampos.rest.model.Pessoa;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtualizarPessoasTest extends PessoaBase {

    @Test
    public void deveAtualizarPessoasComSucesso() {
        Pessoa pessoa = pessoaDataFactory.pessoaDadosAtualizados(pessoaDataFactory.pessoaCadastradaApi());

        Pessoa pessoaAtualizada = pessoaClient.atualizar(pessoa, pessoa.getIdPessoa())
                .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().as(Pessoa.class)
                ;

        assertAll("pessoaAtualizada",
                () -> assertEquals(pessoa.getNome(), pessoaAtualizada.getNome()),
                () -> assertEquals(pessoa.getDataNascimento(), pessoaAtualizada.getDataNascimento()),
                () -> assertEquals(pessoa.getEmail(), pessoaAtualizada.getEmail()),
                () -> assertEquals(pessoa.getEmail(), pessoaAtualizada.getEmail())
        );

        pessoaClient.excluir(pessoa.getIdPessoa())
                .then()
                        .statusCode(HttpStatus.SC_OK);
    }
}
