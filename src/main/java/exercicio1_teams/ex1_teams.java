package exercicio1_teams;

import java.util.Scanner;

public class ex1_teams {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos ingressos de meia-entrada foram vendidos?");
        int meia = teclado.nextInt();
        teclado.nextLine();// limpa o buffer

        System.out.println("Qual o valor de cada meia entrada:");
        String valor_meia = teclado.nextLine();
        valor_meia = valor_meia.replace(",",".");
        double val_meia_conv = Double.valueOf(valor_meia);// faz a conversão de string para double, preciso fazer essa conversão

        System.out.println("Quantos ingressos de entrada inteira foram vendidos?");
        int inteiro = teclado.nextInt();
        teclado.nextLine();//limpa o buffer

        System.out.println("Qual o valor de cada ingresso inteiro:");
        String valor_inteiro = teclado.nextLine();
        valor_inteiro = valor_inteiro.replace(",",".");
        double val_int_conv = Double.valueOf(valor_inteiro);

        double valor_total_meia = val_meia_conv * meia;
        double valor_total_inteiro = val_int_conv * inteiro;
        double valor_total_arrec = valor_total_inteiro + valor_total_meia;
        double valor_medio_ingr = valor_total_arrec / (meia + inteiro);

        System.out.printf("O valor total arrecadado com ingressos inteiros: %.2f\n" , valor_total_inteiro);
        System.out.printf("O valor total arrecadado com ingressos meios: %.2f\n" , valor_total_meia);
        System.out.printf("O valor total arrecadado na sessão: %.2f\n" , valor_total_arrec);
        System.out.printf("O valor médio pago nos ingressos: %.2f\n" , valor_medio_ingr);

    }
}
