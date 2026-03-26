package aula11;

public class Main {
    public static void main(String[] args){
        String nome = "Cantina do Inatel";

        Salgado salgado = new Salgado();// uso isso para enviar os salgados para a pasta Salgado.java

        Salgado salgado1 = new Salgado();// criando novos salgados
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Pizza";// nome do salgado
        salgado.addSalgado(salgado1);

        salgado2.nome = "Pão de Queijo";
        salgado.addSalgado(salgado2);

        salgado3.nome = "Enroladinho de presunto e queijo";
        salgado.addSalgado(salgado3);

        salgado.mostrarInfo();// mostra os salgados armazenados dentro de salgado
    }
}
