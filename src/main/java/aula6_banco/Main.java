package aula6_banco;

public class Main {
    public static void main(String[] args){
        //Conta conta = new Conta(); posso usar dessa maneira também
        var conta = new Conta(); // tipo implícito
        var conta1 = new Conta();// um objeto não interfere no outro
        conta.saldo = 700;
        conta.contaCliente = "Roberto";
        conta.agencia = 0001;
        conta.limite = 400;

        conta.deposita(600);
        conta.saca(250);
        System.out.printf("Na conta " + conta.contaCliente + " tem R$ %.2f\n" , conta.saldo);

        conta1.saldo = 1000;
        conta1.contaCliente = "Ricardão";
        conta1.agencia = 0002;
        conta1.limite = 400;

        conta1.deposita(300);
        conta1.saca(150);
        System.out.printf("Na conta " + conta1.contaCliente + " tem R$ %.2f\n" , conta1.saldo);

        conta.transferir(conta1,200);
        System.out.printf(conta.contaCliente + " tem R$ %.2f\n",conta.saldo);
        System.out.printf(conta1.contaCliente + " tem R$ %.2f\n",conta1.saldo);


    }
}
