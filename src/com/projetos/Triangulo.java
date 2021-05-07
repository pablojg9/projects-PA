package com.projetos;

import javax.swing.JOptionPane;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    //Instancias
    // Métodos
    public void exibirDados() {
        // Usando o JOptionPane para o usuario digite o primeiro lado do triangulo

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o primeiro lado: "));

        // Usando o JOptionPane para o usuario digite o segundo lado do triangulo
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o segundo lado: "));

        // Usando o JOptionPane para o usuario digite o terceiro lado do triangulo
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Coloque o terceiro lado: "));

    }

    public void calcularTriangulo() {

        if (lado1 == lado2 && lado2 == lado3) {
            while (lado1 == lado2 && lado2 == lado3) {
                // recebendo tipo = "TRIANGULO EQUILATERO";
                tipo = "TRIANGULO EQUILATERO";
                // Mostrando os lados recebindo pelo o usuario

                JOptionPane.showMessageDialog(null, "Lado 1: " + lado1 + "\n" + "Lado 2: "
                        + lado2 + "\n" + "Lado 3: " + lado3 + "\n"+ "Tipo de Triangulo: " + tipo);
                // Mostrando o tipo de Triangulo

                tipo = String.valueOf(JOptionPane.showConfirmDialog(null, "Deseja continuar ?"));

                int confirm = Integer.parseInt(tipo);

                // 0 = OK_OPTION
                if (confirm == 0) {
                    while (confirm == 0) {
                        exibirDados();
                        calcularTriangulo();
                        confirm++;
                    }

                }if (confirm == 1) {
                    saida();
                    break;

                    // 2 = CANCEL_OPTION
                } else {
                    saida();
                    break;
                }
            }

        } else if (lado1 == lado2 || lado2 == lado3 && lado1 != lado2 || lado1 == lado3) {

            while (lado1 == lado2 || lado2 == lado3 && lado1 != lado2 || lado1 == lado3) {
                tipo = "TRIANGULO ISÓSCELE";

                JOptionPane.showMessageDialog(null, "Lado 1: " + lado1 + "\n" + "Lado 2: "
                        + lado2 + "\n" + "Lado 3: " + lado3 + "\n"+ "Tipo de Triangulo: " + tipo);

                tipo = String.valueOf(JOptionPane.showConfirmDialog(null, "Deseja continuar ?"));

                int confirm = Integer.parseInt(tipo);

                // 0 = OK_OPTION
                if (confirm == 0) {
                    while (confirm == 0) {
                        exibirDados();
                        calcularTriangulo();
                        confirm++;
                        // 1 = NO_OPTION
                    }if (confirm == 1) {
                        saida();
                         break;
                    } else {
                        saida();
                        break;
                    }
                }
            }
        } else if (lado1 != lado2 || lado2 != lado3 || lado1 != lado3){
                tipo = "TRIANGULO ESCALENO";
                JOptionPane.showMessageDialog(null, "Lado 1: " + lado1 + "\n" + "Lado 2: "
                    + lado2 + "\n" + "Lado 3: " + lado3 + "\n"+ "Tipo de Triangulo: " + tipo);
            while (lado1 != lado2 || lado2 != lado3) {
                tipo = String.valueOf(JOptionPane.showConfirmDialog(null, "Deseja continuar ?"));

                int confirm = Integer.parseInt(tipo);

                // 0 = OK_OPTION
                if (confirm == 0) {
                    while (confirm == 0) {
                    exibirDados();
                    calcularTriangulo();
                    confirm++;

                    // 1 == NO_OPTION
                } if (confirm == 1) {
                        break;
                    } else {
                        saida();
                        break;
                    }
                }
            }
        }
    }
    public void saida() {
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}
