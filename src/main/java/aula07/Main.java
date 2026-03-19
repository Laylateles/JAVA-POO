package aula07;

public class Main {
    public static void main(String[] args){
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 10;
        zumbi2.vida = 9;

        zumbi1.morder();
        zumbi1.correr();

        double vidaZumbi1 = zumbi1.mostraVida();
        System.out.println("Vida do zumbi 1: " + vidaZumbi1);

        double vidaZumbi2 = zumbi2.mostraVida();
        System.out.println("Vida do zumbi 2: " + vidaZumbi2);

        zumbi1.transfereVida(zumbi2, 5); // na parte de zumbiAlvo é qual zumbi, não o nome dele

        System.out.println("Vida do zumbi 1: " + zumbi1.mostraVida());
        System.out.println("Vida do zumbi 2: " + zumbi2.mostraVida());
    }
}
