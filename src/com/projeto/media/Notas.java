package com.projeto.media;

import javax.swing.JOptionPane;


public class Notas {

    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double media;

    public void exibirDados() {
        nome = JOptionPane.showInputDialog("Coloque o nome do aluno: ");


        n1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque a primeira nota: "));

        n2 = Double.parseDouble(JOptionPane.showInputDialog("Coloque a segunda nota: "));

        n3 = Double.parseDouble(JOptionPane.showInputDialog("Coloque a terceira nota: "));


       JOptionPane.showMessageDialog(null, "Primeira nota: "+  n1 + "\n" + "Segunda nota: "
               + n2 + "\n" + "Terceira Nota: " + n3);

        calcularMedia();

    }

    public void calcularMedia() {
        media = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\n" + String.format(String.format("A media do aluno " + nome + " é: " + "%.2f ", media
        )));
    }
}
