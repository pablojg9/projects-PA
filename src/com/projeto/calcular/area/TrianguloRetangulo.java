package com.projeto.calcular.area;

import com.projeto.geometrica.FigGeometrica;

import java.util.Scanner;


// Usando Henrança, FigGeometrica classe PAI
// TrianguloRetangulo classe filho

public class TrianguloRetangulo extends FigGeometrica {

    private double area;
    Scanner scanner = new Scanner(System.in);


    public double calcularArea() {
        System.out.println("Coloque a base: ");
        lado1 = scanner.nextDouble();

        System.out.println("Coloque a altura: ");
        lado2 = scanner.nextDouble();

        area = (lado1 * lado2) / 2;

        System.out.println("O resultado da area é: " + area);

        return area;
    }

    public void exibirArea() {
        calcularArea();

    }




}
