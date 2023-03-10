package com.acampos.rest.tests.pessoas;

import com.acampos.rest.model.Pessoa;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

public class ExcluirPessoaTest extends PessoaBase {

    @Test
    public void excluirPessoaComSucesso() {
        Pessoa pessoaCadastrada = pessoaDataFactory.pessoaCadastradaApi();

        pessoaClient.excluir(pessoaCadastrada.getIdPessoa())
                .then()
                        .statusCode(HttpStatus.SC_OK);
    }
}
