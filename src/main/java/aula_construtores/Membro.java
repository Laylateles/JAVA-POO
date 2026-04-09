package aula_construtores;

public class Membro {
    private String nome;
    private String funcao;

    public Membro(String nome, String funcao){//construtor
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
