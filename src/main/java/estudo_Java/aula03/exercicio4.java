package estudo_Java.aula03;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float NPA = teclado.nextFloat();
        float NFA = 0;
        float NP3 = 0;
        if(NPA >= 60){
            NFA = NPA;
            System.out.println("Não ficou de NP3 e sua nota final é " + NFA);
        } else if(NPA < 30){
            NFA = NPA;
            System.out.println("Reprovado direto! Sem direito a NP3 e sua nota fina é " + NFA);
        } else{
            System.out.println("Ficou de NP3, sua última tentativa...");
            System.out.println("Informe sua nota da NP3:");
            NP3 = teclado.nextFloat();
            NFA = (NPA + NP3)/2;

            if(NFA >= 50){
                System.out.println("Foi por pouco.... Mas está APROVADO");
            }else{
                System.out.println("Sinto muito... Você está reprovado");
            }
        }

    }
}
