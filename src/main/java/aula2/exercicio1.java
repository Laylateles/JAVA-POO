package aula2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        double pi = 3.1415;
        //int inInteiro = pi; -- dá erro, porque não posso fazer essa conversão diretamente double->inteiro
        int inInteir = (int) pi; // tenho que colocar o tipo da variavel para qual eu quero converter-Conversão por casting
        System.out.println(inInteir);// perco dados ao transferir de um tipo para outro

        int idade = 20;
        long idade1 = idade;// porque o tamanho da variavel int é menor doq a variavel long em !!bytes!! conversão por promoção

        float pi_test = 3.1415f; // tenho que colocar o f no final do float por regra da linguagem
        double pi_teste = pi_test;// conversão por promoção

        //char -> string
        char letra = 'F'; // só armazena uma letra
        //char palavra = ['F','O','D','A'] não consegui fazer!!!
        String letra1 = String.valueOf(letra);
        int ano = Integer.parseInt("2026");
        String letra_2 = Character.toString(letra);

        // string -> char
        String faculdade = "Inatel";
        char primeiraLetra  = faculdade.charAt(0);

        //tipos de saida
        System.out.print("Olá mundo");
        System.out.println("Olá mundo 2");
        System.out.printf("Olá %s\n","testando");
        System.out.printf("Nota: %.2f\n", 9.5);

        Scanner teclado = new Scanner(System.in);// teclado é um objeto e scanner é uma classe
        teclado.useLocale(Locale.US);// adicionei para poder trabalhar com ponto = 1.87 sem isso tenho q colocar virgula 1,87


        System.out.println("Entre com sua idade:");
        int minha_idade = teclado.nextInt();//nextInt é uma classe que posso utilizar por causa do objeto

        System.out.println("Entre com sua altura:");
        double altura = teclado.nextDouble();//

        teclado.nextLine();//limpa o buffer do teclado, captura o \n

        System.out.println("Entre com o seu nome:");
        String nome = teclado.nextLine();

        System.out.printf("%d, %.2f, %s \n", minha_idade, altura, nome);
    }
}
// casting e promoções, tirar print dessa pagina do slide, IMPORTANTE!!!!!!!!
// atalho: sout+tab



