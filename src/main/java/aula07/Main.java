package aula07;

public class Main {
    public static void main(String[] args){
        Zumbi zumbi = new Zumbi();

        zumbi.vida = 5; // ele tem 5 de vida
        zumbi.morder("João");
        zumbi.nome = "Roberto";
        System.out.println("Você irá morrer " + zumbi.nome + " você têm apenas mais " + zumbi.vida + " restante(s)");
        zumbi.correr();
    }
}
