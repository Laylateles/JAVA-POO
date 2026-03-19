package aula08;

public class Empresa {
    public String nome;

    public Empresa(){
        Departamento departamento = new Departamento(); // metodo construtor
        departamento.nome = "Engenharia";
        System.out.println(departamento.nome);
    }
}
