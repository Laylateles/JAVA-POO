package aula13.heranca;

public class Brownie {//classe mae
    protected String nome;// o protected só funciona entre as classes mae e filhas e dentro do mesmo pacote
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando no carrinho...");
    }

    public void calculaPrecoTotal(){
        System.out.println("Valor total dos Brownies: ");
    }


}
