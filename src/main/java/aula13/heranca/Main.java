package aula13.heranca;

public class Main {
    public static void main(String[] args){
        BrownieNutella bwNutella = new BrownieNutella("Nutella",8,"Nutella");
        BrownieCafe bwCafe = new BrownieCafe("Cafe",10,"Cafe");

        bwCafe.addMaisCafe();
        bwNutella.addMaisNutella();

        bwNutella.addCarrinhoDeCompras();
    }
}
