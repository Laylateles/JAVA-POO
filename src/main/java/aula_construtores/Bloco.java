package aula_construtores;

public class Bloco {
    private static int nBloco;//objeto em comum entre os objetos, aponta para um mesmo lugar

    public Bloco(){
        nBloco++;
    }

    public int getnBloco(){
        return nBloco;
    }
}
