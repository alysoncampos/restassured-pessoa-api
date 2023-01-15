package com.acampos.rest.data.changeless;

public class PessoaData {

    public static final String SERVICE = "/pessoa";
    public static final String GET_PESSOA_RELATORIO = String.format("%s/relatorio", SERVICE);
    public static final String GET_PESSOA_COMPLETA = String.format("%s/lista-completa", SERVICE);
    public static final String GET_PESSOA_ENDERECOS = String.format("%s/lista-com-enderecos", SERVICE);
    public static final String GET_PESSOA_CONTATOS = String.format("%s/lista-com-contatos", SERVICE);
    public static final String ID_PESSOA = String.format("%s/{idPessoa}", SERVICE);

}
