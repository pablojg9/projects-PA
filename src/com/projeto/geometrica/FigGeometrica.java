package com.projeto.geometrica;

import javax.swing.JOptionPane;


public class FigGeometrica {

    // Usando o protected para fazer herança
    protected double lado1;
    protected double lado2;
    private String figura;

    public void exibirDados() {

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o primeiro lado"));

        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o segundo lado"));

        double result = lado1 + lado2;

        if (result == 4) {
            figura = "quadrado \n" + "Retangulo \n" + "Trápezio \n";
            JOptionPane.showMessageDialog(null, figura);

        } else if (result == 3) {
            figura = "Triangulo";
            JOptionPane.showMessageDialog(null, figura);

        } else if (result == 5) {
            figura = "Pentágono";
            JOptionPane.showMessageDialog(null, figura);

        } else if (result == 6) {
            figura = "Hexágono";
            JOptionPane.showMessageDialog(null, figura);

        } else if (result == 0) {
            figura = "Circulo" + "Oval";
            JOptionPane.showMessageDialog(null, figura);
        } else {
            JOptionPane.showMessageDialog(null,"Formas geometricas não encontradas");
        }
    }

}
