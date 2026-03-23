package aula09_kart;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(){ // método construtor
        this.motor = new Motor();
        motor.cilindradas = "50";
        motor.velocidadeMax = 150;
        motor.mostraInfo();
    }

    public void Pular(){
        System.out.println("Kart pulou");
    }
    public void soltarTurbo(){
        System.out.println("Soltou turbo");
    }
    public void fazerDrift(){
        System.out.println("Fez drift");
    }
}
