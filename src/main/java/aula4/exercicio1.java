package aula4;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner inatel = new Scanner(System.in);
        System.out.println("Entre com a quantidade:");
        int qtd = inatel.nextInt();//recebe valores inteiros que o usuario digita

        //int[] vetor = {1,2,3,5,8};


        /*for(int n : vetor){//ele percorre meu vetor
            System.out.println(n);
        }

        for(int i = 0; i< vetor.length; i++){//vetor.length = tamanho do vetor
            System.out.println(vetor[i]);
        }

        for(int i = qtd; i > 0;i--){
            System.out.println(i);
        }

        for(int i = 0; i < qtd;i++){
            System.out.println(i);
        }

       do{
           System.out.println(qtd);
           qtd--;
        }while (qtd > 0);

        */
        while (qtd > 0) {
            System.out.println(qtd);
            qtd--;//decremento
            if (qtd == 5)
                continue;
        }
        System.out.println("Programa continua");
    }
}