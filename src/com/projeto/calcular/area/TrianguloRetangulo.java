package com.projeto.calcular.area;

import com.projeto.geometrica.FigGeometrica;

import javax.swing.*;
import java.util.Scanner;


// Usando Henrança, FigGeometrica classe PAI
// TrianguloRetangulo classe filho

public class TrianguloRetangulo extends FigGeometrica {

    private double area;

    public double calcularArea() {

        lado1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque a base: "));

        lado2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque a altura"));

        area = (lado1 * lado2) / 2;

        JOptionPane.showMessageDialog(null, "O resultado da area é: " + area);

        return area;
    }

    public void exibirArea() {
        calcularArea();

    }




}
