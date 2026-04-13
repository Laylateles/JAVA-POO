package aula_construtores;

public class MainBanda {
    public static void main(String[] args){
        Musica musica1 = new Musica("Cacos de Vidro",3.35);
        Membro membro1 = new Membro("Bk","Cantor");
        Banda banda = new Banda("Bk","MPB");
        banda.addMembroNovo(membro1);
        banda.addMusicaNova(musica1);
        banda.mostraInfo();
    }
}
