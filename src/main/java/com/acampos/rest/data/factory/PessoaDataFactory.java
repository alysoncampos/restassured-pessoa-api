package com.acampos.rest.data.factory;

import com.acampos.rest.model.Pessoa;
import com.acampos.rest.model.PessoaBuilder;
import net.datafaker.Faker;

import java.text.SimpleDateFormat;

public class PessoaDataFactory {


    private static SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
    private final Faker faker = new Faker();

    public Pessoa pessoaValida() {
        return novaPessoa();
    }

    private Pessoa novaPessoa() {
        Pessoa novaPessoa =
                new PessoaBuilder()
                        .nome(faker.name().nameWithMiddle())
                        .dataNascimento(data.format(faker.date().birthday()))
                        .cpf(faker.cpf().valid(false))
                        .email(faker.internet().emailAddress())
                        .build();

        return novaPessoa;
    }
}
