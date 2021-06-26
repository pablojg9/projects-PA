package com.atividade;

import java.util.Scanner;

public class MatrizAtividade {

    public void exercicio(){
        Scanner scanner = new Scanner(System.in);
        String[][] amarzenar = new String[2][5];

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Coloque o nome: ");
            amarzenar[counter][counter] = scanner.next();


        }


    }

}
