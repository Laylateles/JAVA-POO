package aula3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de alunos matriculados em C06:");
        int n_alunos = teclado.nextInt();//recebe o numero de alunos matriculados

        switch (n_alunos){
            case 10:
                System.out.println("A sala utilizada é a I-6");
                break;
            case 20:
                System.out.println("A sala utilizada é a I-6");
                break;
            case 30:
                System.out.println("A sala utilizada é a I-5");
                break;
            default:
                System.out.println("Não temos salas disponiveis!");
                break;

        }
    }
}
