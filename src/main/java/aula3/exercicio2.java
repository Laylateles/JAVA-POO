package aula3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a nota da NPA:");
        int NPA = tecla.nextInt();//recebe o valor da NPA
        if(NPA >= 60){
            System.out.println("O aluno está aprovado!");
        } else if(NPA >= 30  && NPA < 60){
            System.out.println("O aluno ficou de NP3!");
            System.out.println("Digite a nota da NP3:");
            int NP3 = tecla.nextInt();
            double NFA = (NPA + NP3)/2;
            if(NFA >= 50){
                System.out.println("O aluno está aprovado!");
            }else{
                System.out.println("O aluno foi reprovado!");
            }
        } else{
            System.out.println("Reprovado direto!!");
        }
    }
}
