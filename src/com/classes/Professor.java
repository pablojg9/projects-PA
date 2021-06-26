package com.classes;

public class Professor extends Pessoa{
    // NomeNota no pacote projetos

    private String RA;
    private String formacao;

    @Override
    public void exibirDados() {
        System.out.println(RA);
        System.out.println(formacao);
        System.out.println(nome);
    }
}
