package com.projetos;

import java.util.Scanner;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    //Instancias
    Scanner scanner = new Scanner(System.in);

    // Métodos
    public void exibirDados() {
        // Usando o scanner para o usuario digite o primeiro lado do triangulo
        System.out.println("Coloque o primeiro lado: ");
        lado1 = scanner.nextDouble();
        // Usando o scanner para o usuario digite o segundo lado do triangulo
        System.out.println("Coloque o segundo lado: ");
        lado2 = scanner.nextDouble();

        // Usando o scanner para o usuario digite o terceiro lado do triangulo
        System.out.println("Coloque o terceiro lado: ");
        lado3 = scanner.nextDouble();

    }

    public void calcularTriangulo() {

        if (lado1 == lado2 && lado2 == lado3) {
            while (lado1 == lado2 && lado2 == lado3) {
                // recebendo tipo = "TRIANGULO EQUILATERO";
                tipo = "TRIANGULO EQUILATERO";
                // Mostrando os lados recebindo pelo o usuario
                System.out.println("Lado 1: " + lado1 + "\nlado 2: " + lado2 + "\nlado 3: " + lado3);
                // Mostrando o tipo de Triangulo
                System.out.println(tipo + "\n");

                System.out.println("Deseja continuar? (Y/N)");
                tipo = scanner.next();
                if (tipo.equalsIgnoreCase("y") || tipo.equalsIgnoreCase("s")) {
                    exibirDados();
                } else {
                    break;
                }
            }

        } else if (lado1 == lado2 || lado2 == lado3 && lado1 != lado2 || lado1 == lado3) {
            while (lado1 == lado2 || lado2 == lado3 && lado1 != lado2 || lado1 == lado3) {
                tipo = "TRIANGULO ISÓSCELE";
                System.out.println("Lado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3);
                System.out.println(tipo + "\n");

                System.out.println("Deseja continuar? (Y/N)");
                tipo = scanner.next();
                if (tipo.equalsIgnoreCase("y") || tipo.equalsIgnoreCase("s")) {
                    exibirDados();
                } else {
                    break;
                }
            }
        } else {
            tipo = "TRIANGULO ESCALENO";
            System.out.println("Lado 1: " + lado1 + "\nLado 2: " + lado2 + "\nLado 3: " + lado3);
            System.out.println(tipo + "\n");
            while (lado1 != lado2 || lado2 != lado3) {
                System.out.println("Deseja continuar? (Y/N)");
                tipo = scanner.next();
                if (tipo.equalsIgnoreCase("y") || tipo.equalsIgnoreCase("s")) {
                    exibirDados();
                } else {
                    break;
                }
            }
        }

        System.out.println("Programa finalizado!");

    }

}
