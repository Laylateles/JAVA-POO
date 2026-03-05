package aula4;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Adivinhe o número gerado");
        int n_chute = teclado.nextInt();

        Random rand = new Random(); //para gerar um número aleatório
        int x = rand.nextInt(10) + 1;// gerou um numero de 1 a 10 e salvou em x

        while(n_chute != x) {
            System.out.println("Você errou o número! Tente novamente");
            if(n_chute > x){
                System.out.println("O número que você digitou é maior que o número gerado");
            } else{
                System.out.println("O número que você digitou é menor que o número gerado pelo computador");
            }

            n_chute = teclado.nextInt();
        }
        System.out.println("Você acertou o número!! O número que gerei foi " + x);

    }
}

