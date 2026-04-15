package estudo_Java.aula03;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in); // recebe o numero de alunos matriculados
        int nMatr = tecla.nextInt();

        switch (nMatr) {
            case 10:
                System.out.println("Sala: I-6");
            break;
            case 20:
                System.out.println("Sala: I-6");
            break;
            case 30:
                System.out.println("Sala: I-5");
            break;
            default:
                System.out.println("Insira um valor válido");
            break;
        }
    }
}
