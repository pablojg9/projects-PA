package com.projeto.geometrica;

import java.util.Scanner;

public class FigGeometrica {

    // Usando o protected para fazer herança
    protected double lado1;
    protected double lado2;
    private String figura;

    Scanner scanner = new Scanner(System.in);

    public void exibirDados() {
        System.out.println("Coloque o primeiro lado: ");
        lado1 = scanner.nextDouble();

        System.out.println("Coloqueo o segundo lado: ");
        lado2 = scanner.nextDouble();

        double result = lado1 + lado2;

        if (result == 4) {
            figura = "quadrado \n" + "Retangulo \n" + "Trápezio \n";
            System.out.println(figura);

        } else if (result == 3) {
            figura = "Triangulo";
            System.out.println(figura);

        } else if (result == 5) {
            figura = "Pentágono";
            System.out.println(figura);

        } else if (result == 6) {
            figura = "Hexágono";
            System.out.println(figura);

        } else if (result == 0) {
            figura = "Circulo" + "Oval";
            System.out.println(figura);

        } else {
            System.out.println("Formas geometricas não encontradas");
        }
    }

}
