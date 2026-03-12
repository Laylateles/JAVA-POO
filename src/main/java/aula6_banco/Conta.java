package aula6_banco;

public class Conta {
    // Atributos da classe
    public double saldo;//deixei eles acessiveis em todo o projeto
    public double limite;
    public int agencia;
    public int contaCliente;

    // Métodos
    public void deposita(double quantia){
        this.saldo += quantia;//this acessa todos os atributos dentro da classe conta

    }

    public void saca(double quantia){
        this.saldo -= quantia;
    }
}
