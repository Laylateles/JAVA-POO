package aula07;

public class Zumbi {
    public String nome;
    public int vida;

    public void morder(String pessoa){
        this.vida -= 1; // a pessoa perde 1 de vida
    }

    public void correr(){
        System.out.println("Eu estou atrás de você " + nome);
    }
}
