package aula12;

public class Banda {
    public String nome;
    public String genero;

    public Membro [] membros = new Membro[10];
    public Musica [] musicas = new Musica[100];
    public Empresario empresario;

    public void mostraInfo(){
        System.out.println("Nome da Banda: " + this.nome);
        System.out.println("Gênero da Banda: " + this.genero);
        if(this.empresario.nome != null)
            System.out.println("Empresário: " + this.empresario.nome);
        System.out.println("Músicas: ");
        for(int i = 0; i < this.musicas.length; i++){
            if(this.musicas[i] != null){
                System.out.println(this.musicas[i].nome);
            }
        }
        System.out.println("Membros: ");
        for(int i = 0; i < this.membros.length; i++){
            if(this.membros[i] != null){
                System.out.println(this.membros[i].nome);
            }
        }
    }

    public void addMusicaNova(Musica musica){
        for(int i = 0; i < this.musicas.length; i++){
            if(this.musicas[i] == null){
                this.musicas[i] = musica;
                break;
            }
        }
    }

    public  void addMembro(Membro membro){
        for(int i = 0; i < this.membros.length; i++){
            if(this.membros[i] == null){
                this.membros[i] = membro;
                break;
            }
        }
    }

    public void addEmpresario(Empresario empresario){
        this.empresario = empresario;
    }
}
