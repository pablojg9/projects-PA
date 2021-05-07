package com.projeto.calculadora.imc;

import javax.swing.JOptionPane;

public class IndiceMassa {

    protected String nome;
    private String sexo;
    private double altura;
    protected double imc;
    private double peso;

    public double calcularImc() {
        nome = JOptionPane.showInputDialog(null, "Coloque seu nome: ");


        sexo = JOptionPane.showInputDialog(null, "Coloque seu sexo (M/S)");

        if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("m")) {

            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque seu peso: "));

            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque sua altura"));

            imc = peso / (altura * altura);


            if (imc > 1 && imc < 20.7) {
                JOptionPane.showMessageDialog(null, "você está abaixo do peso");
            } else if (imc >= 20.7 && imc < 26.4) {
                JOptionPane.showMessageDialog(null, "você está saudável");
            } else if (imc >= 26.4 && imc < 27.8) {
                JOptionPane.showMessageDialog(null, "você está acima do peso");
            } else if (imc >= 27.8 && imc < 32.5) {
                JOptionPane.showMessageDialog(null, "você está acima do peso ideal");
            }  else {
                JOptionPane.showMessageDialog(null, "você está obeso");
            }
        }

        if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f")) {
            double peso;
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque seu peso: "));

            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque sua altura: "));

            imc = peso / (altura * altura);

            if (imc > 1 && imc < 19.1) {
                JOptionPane.showMessageDialog(null, "você está abaixo do peso");
            } else if (imc >= 19.1 && imc < 25.8) {
                JOptionPane.showMessageDialog(null, "você está saudável");
            } else if (imc >= 25.8 && imc < 27.3) {
                JOptionPane.showMessageDialog(null, "você está acima do peso");
            } else if (imc >= 27.3 && imc < 31.1) {
                JOptionPane.showMessageDialog(null, "você está acima do peso ideal");
            }  else {
                JOptionPane.showMessageDialog(null, "você está obeso");
            }
        }

        return imc;

    }

    public void exibirDados() {

        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\n" + "Seu sexo: "
                + sexo + "\n" + "seu peso é: " + peso + "\n" + "sua altura é: " + altura + "\n"
                    + "O seu calculo imc é " + String.format("%.2f", imc));


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
