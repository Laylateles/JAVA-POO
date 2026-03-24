package estudo_Java;

public class Exercicio1_lancheZe {
    public static void main(String[] args){
        int primeiraHora,segundaHora,terceiraHora;
        primeiraHora = 10; // número de lanches comidos
        segundaHora = 4;
        terceiraHora = 2;
        int total = primeiraHora + segundaHora + terceiraHora; // numero total de lanches comidos
        double media = total/3; // total de lanches em 3 horas faço a media de quantos lanches foram comidos por hora

        System.out.println("Total de lanches comidos: " + total);
        System.out.println("Média dos lanches: " + media);
    }
}
