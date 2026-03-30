package aula12;

public class Main {
    public static void main(String[] args){
        Banda banda = new Banda();
        banda.nome = "Guns N' Roses";
        banda.genero = "Rock";

        Musica musica1 = new Musica();
        musica1.nome = "November Rain";

        Musica musica2 = new Musica();
        musica2.nome = "Sweet Child O'Mine";

        Membro membro1 = new Membro();
        membro1.nome = "Slash";

        Empresario empresario = new Empresario();
        empresario.nome = "Não sei";

        banda.addEmpresario(empresario);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMembro(membro1);

        banda.mostraInfo();

    }
}
