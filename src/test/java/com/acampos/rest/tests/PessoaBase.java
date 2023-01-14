package com.acampos.rest.tests;

import com.acampos.rest.client.PessoaClient;
import com.acampos.rest.data.factory.PessoaDataFactory;

public class PessoaBase extends BaseTest {
    protected final PessoaClient pessoaClient = new PessoaClient();
    protected final PessoaDataFactory pessoaDataFactory = new PessoaDataFactory();

}
