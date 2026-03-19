package aula07;

public class Main {
    public static void main(String[] args){
        Zumbi zumbi1 = new Zumbi();

        zumbi1.morder();
        zumbi1.nome = "Roberto";
        System.out.println("Você irá morrer " + zumbi1.nome);
        zumbi1.correr();
    }
}
