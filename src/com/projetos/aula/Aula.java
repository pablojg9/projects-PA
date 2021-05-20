package com.projetos.aula;

import javax.swing.*;

public class Aula {

    public void mostrarAluno() {

        for (int x = 1; x <= 10; x++) {
            String nome = JOptionPane.showInputDialog(null, "Coloque o seu nome: ");

            System.out.println("O " + x+"º" + " aluno é " + nome);

        }



    }

}
