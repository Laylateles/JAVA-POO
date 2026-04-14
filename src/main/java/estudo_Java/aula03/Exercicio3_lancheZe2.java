package estudo_Java.aula03;

import java.util.Scanner;

public class Exercicio3_lancheZe2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); // para aceitar dados digitados pelo usuario

        System.out.println("Digite o número de lanches consumidos no trailler nas três primeiras horas: ");

        int lanchePrimH = teclado.nextInt();// numero de lanches consumidos na primeira hora
        int lancheSegH = teclado.nextInt();
        int lancheTerH = teclado.nextInt();

        float total = lanchePrimH + lancheSegH + lancheTerH; // total de lanches consumidos
        float media = total /3;// total de lanchedividido pelo numero de horas, media de lanche consumido por hora

        System.out.println("O total de lanche consumido foi: " + total);
        System.out.printf("A media de lanche consumido por hora: %.2f\n" , media);
    }
}
