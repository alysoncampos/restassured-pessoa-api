package com.acampos.rest.utils;

import com.acampos.rest.model.Login;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Auth {

    public String autenticaticaoAdm() {

        Login login = new Login("admin", "123");

        return given()
                .contentType(ContentType.JSON)
                .body(login)
        .when()
                .post("http://vemser-dbc.dbccompany.com.br:39000/vemser/dbc-pessoa-api/auth")
        .then()
                .extract().asString()
        ;
    }
}
