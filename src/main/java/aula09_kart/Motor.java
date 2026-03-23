package aula09_kart;

public class Motor {
    public String cilindradas;
    public float velocidadeMax;

    public void mostraInfo(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
    }
}
