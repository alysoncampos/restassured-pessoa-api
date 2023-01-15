package com.acampos.rest.spec;

import com.acampos.rest.utils.Auth;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PessoaSpecs {

    private static String token = new Auth().autenticaticaoAdm();

    private PessoaSpecs() {}

    public static RequestSpecification reqSpec() {

        return new RequestSpecBuilder()
                .addHeader("Authorization", token)
                .setContentType(ContentType.JSON)
                .build();
    }
}
