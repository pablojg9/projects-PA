package com.classes;

public class Pessoa {
    // NomeNota no pacote projetos

    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected String cpf;
    protected String endereço;

    public void exibirDados() {
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(cpf);
        System.out.println(endereço);

    }


}
