package aula07;

public class Zumbi {
    public String nome;
    public double vida;
    public int nivelFome;

    public void morder(){
        System.out.println("Irei te morder!!");
    }

    public void correr(){
        System.out.println("Eu estou atrás de você");
    }

    public double mostraVida(){
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia){
        this.vida += quantia;
        zumbiAlvo.vida -= quantia;
    }
}
