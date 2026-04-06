package aula_package;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    public float getSaldo() {// só consigo ver, não posso alterar
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){
        if (this.saldo > quantia){
            this.saldo -= quantia;
        } else{
            System.out.println("Saldo Insuficiente!!");
        }
    }
    public void deposita(float quantia){
        if (this.limite < this.saldo+quantia){
            System.out.println("Deposito ultrapassa o limite da conta!");
        } else{
            this.saldo += quantia;
        }
    }
}
