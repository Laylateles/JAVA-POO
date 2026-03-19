package aula08;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.nome = "João";
        cliente.cpf = "125.239.754-66";
        cliente.endereco = "Rua 2";

        conta.saldo = 1000;
        conta.titular = cliente;

        System.out.println(conta.titular.nome);
        System.out.println(cliente.nome);

        Empresa empresa = new Empresa();
    }
}
