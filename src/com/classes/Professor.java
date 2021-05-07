package com.classes;

public class Professor extends Pessoa{

    private String RA;
    private String formacao;

    @Override
    public void exibirDados() {
        System.out.println(RA);
        System.out.println(formacao);
        System.out.println(nome);
    }
}
