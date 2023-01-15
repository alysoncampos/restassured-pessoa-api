package com.acampos.rest.client;

import com.acampos.rest.data.changeless.PessoaData;
import com.acampos.rest.model.Pessoa;
import com.acampos.rest.spec.PessoaSpecs;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PessoaClient {

    public Response listarPessoas() {
        Response resp =
                given()
                        .spec(PessoaSpecs.reqSpec())
                .when()
                        .get(PessoaData.SERVICE)
                ;

        return resp;
    }

    public Response cadastrar(Pessoa pessoa) {
        Response resp =
                given()
                        .spec(PessoaSpecs.reqSpec())
                        .body(pessoa)
                .when()
                        .post(PessoaData.SERVICE)
                ;

        return resp;
    }

    public Response atualizar(Pessoa pessoa, Integer idPessoa) {
        Response resp =
                given()
                        .spec(PessoaSpecs.reqSpec())
                        .body(pessoa)
                        .pathParam("idPessoa", idPessoa)
                .when()
                        .put(PessoaData.ID_PESSOA)
                ;

        return resp;
    }

    public Response excluir(Integer idPessoa) {
        Response resp =
                given()
                        .spec(PessoaSpecs.reqSpec())
                        .pathParam("idPessoa", idPessoa)
                .when()
                        .delete(PessoaData.ID_PESSOA)
                ;

        return resp;
    }
}
