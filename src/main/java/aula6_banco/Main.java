package aula6_banco;

public class Main {
    public static void main(String[] args){
        //Conta conta = new Conta(); posso usar dessa maneira também
        var conta = new Conta(); // tipo implícito

        conta.saldo = 700;
        conta.contaCliente = 12345;
        conta.agencia = 0001;
        conta.limite = 400;

        conta.deposita(600);
        conta.saca(250);
        System.out.printf("Na conta " + conta.contaCliente + " tem R$ %.2f\n" , conta.saldo);

    }
}
