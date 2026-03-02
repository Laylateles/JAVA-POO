package aula3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int qtd = teclado.nextInt();

        if(qtd > 5){
            System.out.println("Qtd é maior do que 5");
        } else if (qtd >= 10){
            System.out.println("Qtd é maior ou igual a 10");
        }
    }
}
///  < , > , <= , >= , != , ==
/// && , ||



