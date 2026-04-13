package aula_construtores;

public class Empresario {
    private String nome;
    private long cnpj;

    public Empresario(String nome, long cnpj){//construtor
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
}
