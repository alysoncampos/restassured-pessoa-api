package com.acampos.rest.tests.pessoas;

import com.acampos.rest.client.PessoaClient;
import com.acampos.rest.data.factory.PessoaDataFactory;
import com.acampos.rest.tests.base.BaseTest;

public abstract class PessoaBase extends BaseTest {

    protected final PessoaClient pessoaClient = new PessoaClient();
    protected final PessoaDataFactory pessoaDataFactory = new PessoaDataFactory();

}
