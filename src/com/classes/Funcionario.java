package com.classes;

public class Funcionario extends Pessoa{

    private String funcao;
    private double salario;

    @Override
    public void exibirDados() {
        System.out.println(funcao);
        System.out.println(salario);

    }
}
