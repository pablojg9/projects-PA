package AtividadeFinal.exercicio6;

import java.util.Scanner;

public class ExercicioSeis {

    Scanner scanner = new Scanner(System.in);

    public int exibirRaiz(){
        System.out.println("Coloque um número para ver a raiz: ");
        int numero = scanner.nextInt();
        System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));

        return numero;
    }

}
