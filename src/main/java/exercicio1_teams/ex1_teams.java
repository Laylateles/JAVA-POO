package exercicio1_teams;

import java.util.Scanner;

public class ex1_teams {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos ingressos de meia-entrada foram vendidos?");
        int meia = teclado.nextInt();
        System.out.println("Qual o valor deles?");
        String valor_meia = teclado.nextLine();
        teclado.nextLine();// limpa o buffer
        System.out.println("Quantos ingressos de entrada inteira foram vendidos?");
        int inteiro = teclado.nextInt();
        System.out.println("Qual o valor deles?");
        teclado.nextLine();
        String valor_inteiro = teclado.nextLine();
    // preciso tratar essas strings e converte-las para double!!
    }
}
