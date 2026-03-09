package aula5_objeto;

public class Professor extends Pessoa {//herança, recebe
    String disciplina;
    void ministraAula(){
        System.out.println("Aula de: " + disciplina);
    }
}
