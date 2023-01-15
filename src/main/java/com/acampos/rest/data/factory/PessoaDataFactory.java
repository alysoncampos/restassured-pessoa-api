package com.acampos.rest.data.factory;

import com.acampos.rest.client.PessoaClient;
import com.acampos.rest.model.Pessoa;
import com.acampos.rest.model.PessoaBuilder;
import net.datafaker.Faker;
import org.apache.http.HttpStatus;

import java.text.SimpleDateFormat;

public class PessoaDataFactory {

    PessoaClient pessoaClient = new PessoaClient();
    private static SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
    private final Faker faker = new Faker();

    public Pessoa pessoaValida() {
        return novaPessoa();
    }

    public Pessoa pessoaDadosAtualizados(Pessoa pessoa) {
        pessoa.setNome(faker.name().nameWithMiddle());
        pessoa.setEmail(faker.internet().emailAddress());
        return pessoa;
    }

    public Pessoa pessoaCadastradaApi() {
        Pessoa pessoa = pessoaClient.cadastrar(pessoaValida())
                .then()
                        .statusCode(HttpStatus.SC_OK)
                        .extract().as(Pessoa.class)
                ;

        return pessoa;
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
