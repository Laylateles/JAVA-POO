package aula_construtores;

public class Banda {
    private String nome;
    private String genero;

    public Banda(String nome, String genero){//construtor
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public void addMusicaNova(Musica musica){

    }

    public void addMembroNovo(Membro membro){
        
    }

}
