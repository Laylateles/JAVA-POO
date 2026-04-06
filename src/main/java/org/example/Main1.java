package org.example;
import br.inatel.poo.banco.Conta;

public class Main1 {
    public static void main(String[] args){
        //Conta conta = new Conta();
        //conta.saque(1000);

        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(20);
        System.out.println(pessoa.getIdade());
    }
}
