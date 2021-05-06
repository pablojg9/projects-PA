package com.projeto.calculadora.imc;

import java.util.Scanner;

public class IndiceMassa {

    private String nome;
    private String sexo;
    private double altura;
    private double imc;
    private double peso;


    Scanner scanner = new Scanner(System.in);

    public double calcularImc() {
        System.out.println("Coloque seu nome: ");
        nome = scanner.next();

        System.out.println("Coloque seu  sexo (m/f): ");
        sexo = scanner.next();

        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {


            System.out.println("Infome seu peso: ");
            peso = scanner.nextDouble();

            System.out.println("Infome sua altura (Usando virgula): " );
            altura = scanner.nextDouble();

            imc = peso / (altura * altura);

            if (imc > 1 && imc < 20.7) {
                System.out.println(nome + " você está abaixo do peso");
            } else if (imc >= 20.7 && imc < 26.4) {
                System.out.println(nome + " você está saudável");
            } else if (imc >= 26.4 && imc < 27.8) {
                System.out.println(nome + " você está acima do peso");
            } else if (imc >= 27.8 && imc < 32.5) {
                System.out.println(nome + " você está acima do peso ideal");
            }  else {
                System.out.println(nome + " você está obeso");
            }
        }

        if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
            double peso;
            System.out.println("Infome seu peso: ");

            peso = scanner.nextDouble();

            System.out.println("Infome sua altura: ");
            altura = scanner.nextDouble();

            imc = peso / (altura * altura);

            if (imc > 1 && imc < 19.1) {
                System.out.println(nome + " você está abaixo do peso");
            } else if (imc >= 19.1 && imc < 25.8) {
                System.out.println(nome + " você está saudável");
            } else if (imc >= 25.8 && imc < 27.3) {
                System.out.println(nome + " você está acima do peso");
            } else if (imc >= 27.3 && imc < 31.1) {
                System.out.println(nome + " você está acima do peso ideal");
            }  else {
                System.out.println(nome + " você está obeso");
            }

        }

        return imc;

    }

    public void exibirDados() {
        System.out.println("seu nome é: " + nome);
        System.out.println("Seu sexo: " + sexo);
        System.out.println("seu peso é: " + peso);
        System.out.println("Sua altura é: " + altura);

        for (int x = 1; x < 30; x++) {
            System.out.print("*");
        }

        System.out.println("\n" + "Seu calculo imc é: ");
        System.out.println(String.format("%.2f", imc));

    }



}
