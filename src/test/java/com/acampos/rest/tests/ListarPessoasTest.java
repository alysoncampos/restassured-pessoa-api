package com.acampos.rest.tests;

import com.acampos.rest.data.changeless.PessoaData;
import com.acampos.rest.utils.Auth;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListarPessoasTest extends PessoaBase {

    @Test
    public void deveListarPessoasComSucesso() {

        pessoaClient.listarPessoas()
                .then()
                        .statusCode(HttpStatus.SC_OK)
                        .time(lessThan(2L), TimeUnit.SECONDS)
        ;
    }

//    @Test
//    public void deveListarPessoasComRelatorioComSucesso() {
//        given()
//                .header("Authorization", tokenAdmin)
//        .when()
//                .get(PessoaData.GET_PESSOA_RELATORIO)
//        .then()
//                .statusCode(HttpStatus.SC_OK)
//                .time(lessThan(2L), TimeUnit.SECONDS)
//        ;
//    }
//
//    @Test
//    public void deveListarPessoasCompletasComSucesso() {
//        given()
//                .header("Authorization", tokenAdmin)
//        .when()
//                .get(PessoaData.GET_PESSOA_COMPLETA)
//        .then()
//                .statusCode(HttpStatus.SC_OK)
//                .time(lessThan(3L), TimeUnit.SECONDS)
//        ;
//    }
//
//    @Test
//    public void deveListarPessoasComEnderecosComSucesso() {
//        given()
//                .header("Authorization", tokenAdmin)
//        .when()
//                .get(PessoaData.GET_PESSOA_ENDERECOS)
//        .then()
//                .statusCode(HttpStatus.SC_OK)
//                .time(lessThan(2L), TimeUnit.SECONDS)
//        ;
//    }
//
//    @Test
//    public void deveListarPessoasComContatosComSucesso() {
//        given()
//                .header("Authorization", tokenAdmin)
//        .when()
//                .get(PessoaData.GET_PESSOA_CONTATOS)
//        .then()
//                .statusCode(HttpStatus.SC_OK)
//                .time(lessThan(2L), TimeUnit.SECONDS)
//        ;
//    }
}
