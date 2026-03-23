package aula09_kart;

public class Main {
    public static void main(String[] args){
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.piloto = p1; // ponteiro que aponta para a mesma localização na memória
        k2.piloto = p2;

        k1.motor.cilindradas = "50";
        k2.motor.cilindradas = "100";

        k1.motor.velocidadeMax = 150;
        k2.motor.velocidadeMax = 100;


    }
}
