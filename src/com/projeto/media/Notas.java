package com.projeto.media;

import java.util.Scanner;

public class Notas {

    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double media;

    Scanner scanner = new Scanner(System.in);

    public void exibirDados() {
        System.out.println("Coloque o nome do aluno: ");
        nome = scanner.next();

        System.out.println("Coloque a primeira Nota: ");
        n1 = scanner.nextDouble();

        System.out.println("Coloque a segunda nota: ");
        n2 = scanner.nextDouble();

        System.out.println("Coloque a terceira nota: ");
        n3 = scanner.nextDouble();

        System.out.println("\n"+ "Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Nota 3: " + n3 + "\n");

        calcularMedia();

    }

    public void calcularMedia() {
        media = (n1 + n2 + n3) / 3;

        System.out.println("O nome do aluno é " + nome);
        System.out.println(String.format("A media do aluno " + nome + " é: " + "%.2f ", media));
    }



}
