package AtividadeFinal.exercicio7;

import java.util.Scanner;

public class NomeNota {
    void exercicio() {
        Scanner scanner = new Scanner(System.in);


        String[] nome = new String[5];
        float[][] nota = new float[5][4];
        float[] media = new float[2];
        float resultado = 0;
        float resultadoDuo = 0;


        for (int counter = 0; counter < nome.length; counter++) {
            System.out.println("Coloque o " + (counter + 1) + "º nome: ");
            nome[counter] = scanner.next();
        }

        for (int counter = 0; counter < nota.length; counter++) {
            for (int poscoluna = 0; poscoluna < nota[counter].length; poscoluna++) {
                System.out.println("Coloque a " + (poscoluna + 1) + "º do nota do aluno: " + nome[counter]);
                nota[counter][poscoluna] = scanner.nextFloat();
            }

            for (int counterDuo = 0; counterDuo < nota[1].length; counterDuo++) {
                resultado +=  nota[counter][counterDuo];
                resultadoDuo = resultadoDuo/4;

                System.out.println(resultadoDuo);

            }
        }

        System.out.println("=============================================");

        System.out.println("Os nomes são: ");
        for (String nomeDuo : nome) {
            System.out.println(nomeDuo);
        }
        System.out.println("=============================================");

        System.out.println("Nota do aluno: ");
        for (int counter = 0; counter < 5; counter++) {

            System.out.println("ALUNO: " + nome[counter]);
            for (int counterDuo = 0; counterDuo < nota[1].length; counterDuo++) {
                System.out.println("Nota " + (counterDuo + 1) + ": " + nota[counter][counterDuo]);

            }
            System.out.println("=============================================");
        }

        System.out.println("A média das notas é: \n");
        for (int counterTree = 0; counterTree < 5;counterTree++){
            for(int counterMatriz = 0; counterMatriz < nota[1].length; counterMatriz++) {
                resultado = (resultado + nota[counterTree][counterMatriz]);

                resultadoDuo = resultado /4;
            }

            System.out.println(resultadoDuo);
        }

    }
}
