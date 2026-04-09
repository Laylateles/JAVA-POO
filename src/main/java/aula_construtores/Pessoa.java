package aula_construtores;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){// construtor
        System.out.println("Criando instância de pessoa com 2 parâmetros");
        this.nome = nome;
        this.idade = idade;
        System.out.println(nome);
        System.out.println(idade);
    }

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println(nome);
        System.out.println("Criando instância de pessoa com 1 parâmetro");
    }

    public Pessoa(){
        System.out.println("Criando instância de pessoa SEM parâmetro");
    }
}
