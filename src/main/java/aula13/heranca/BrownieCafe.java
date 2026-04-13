package aula13.heranca;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);// esse super ele referencia o construtor da classe mae
    }

    public void addMaisCafe(){
            System.out.println("Adicionando mais cafe...");
    }
}
