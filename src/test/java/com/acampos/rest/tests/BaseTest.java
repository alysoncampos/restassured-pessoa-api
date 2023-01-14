package com.acampos.rest.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://vemser-dbc.dbccompany.com.br:39000/vemser/dbc-pessoa-api";

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

}
