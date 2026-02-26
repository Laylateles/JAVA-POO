package aula2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner lanche = new Scanner(System.in);

        System.out.println("Quantos lanches foram consumidos na primeira hora?");
        int primeira_hora = lanche.nextInt();// para a pessoa colocar o numero de lanches consumidos;

        System.out.println("Quantos lanches foram consumidos na segunda hora?");
        int segunda_hora = lanche.nextInt();

        System.out.println("Quantos lanches foram consumidos na terceira hora");
        int terceira_hora = lanche.nextInt();

        int soma = primeira_hora+segunda_hora+terceira_hora;
        double media = soma/3;

        System.out.printf("A soma dos lanches consumidos foi: %d\n",soma);
        System.out.printf("A media foi: %.2f\n", media);
    }
}
