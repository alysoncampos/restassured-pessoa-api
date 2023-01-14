package com.acampos.rest.client;

import com.acampos.rest.data.changeless.PessoaData;
import com.acampos.rest.model.Pessoa;
import com.acampos.rest.utils.Auth;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PessoaClient {
    private static String tokenAdmin = new Auth().autenticaticaoAdm();

    public Response listarPessoas() {
        Response resp =
                given()
                        .header("Authorization", tokenAdmin)
                .when()
                        .get(PessoaData.SERVICE)
                ;

        return resp;
    }

    public Response cadastrar(Pessoa pessoa) {
        Response resp =
                given()
                        .header("Authorization", tokenAdmin)
                        .contentType(ContentType.JSON)
                        .body(pessoa)
                .when()
                        .post(PessoaData.SERVICE)
                ;

        return resp;
    }

    public Response excluir(Integer idPessoa) {
        Response resp =
                given()
                        .header("Authorization", tokenAdmin)
                        .pathParam("idPessoa", idPessoa)
                .when()
                        .delete(PessoaData.DELETE_ID_PESSOA)
                ;

        return resp;
    }
}
