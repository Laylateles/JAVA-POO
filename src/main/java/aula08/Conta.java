package aula08;

public class Conta {
    // Atributos da classe
    public double saldo;//deixei eles acessiveis em todo o projeto
    public double limite;
    public int numero;
    public Cliente titular;


    // Métodos
    public void deposita(double quantia){
        this.saldo += quantia;//this acessa todos os atributos dentro da classe conta

    }

    public void saca(double quantia){
        this.saldo -= quantia;
    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
