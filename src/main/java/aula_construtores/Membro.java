package aula_construtores;

public class Membro {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao){//construtor
        this.nome = nome;//metodos set
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }


    public String getNome() {
        return nome;
    }

}
