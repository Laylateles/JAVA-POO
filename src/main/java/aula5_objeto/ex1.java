package aula5_objeto;

public class ex1 {
    public static void main(String[] args){
        Pessoa Loiro = new Pessoa(); // new serve para criar um novo objeto
        Loiro.nome = "João Heber";
        Loiro.idade = 25;
        Loiro.falar();

        Professor POO = new Professor();
        POO.idade = 35;
        POO.nome = "lauro";
        POO.disciplina = "Portugues";
        POO.falar();
        POO.ministraAula();
    }
}



