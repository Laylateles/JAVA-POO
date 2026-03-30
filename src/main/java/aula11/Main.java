package aula11;

public class Main {
    public static void main(String[] args){
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel:";

        Salgado salgado1 = new Salgado();// criando novos salgados
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Pizza";// nome do salgado
        cantina.addSalgado(salgado1);

        salgado2.nome = "Pão de Queijo";
        cantina.addSalgado(salgado2);

        salgado3.nome = "Enroladinho de presunto e queijo";
        cantina.addSalgado(salgado3);

        cantina.mostrarInfo();// mostra os salgados armazenados dentro de salgado
    }
}
