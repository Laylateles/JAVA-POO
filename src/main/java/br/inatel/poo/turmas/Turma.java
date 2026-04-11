package br.inatel.poo.turmas;

public class Turma {
    public int quantidadeAlunos;
    Aluno[] alunos;

    public Turma(int quantidadeAlunos){
        this.quantidadeAlunos = quantidadeAlunos;
        this.alunos = new Aluno[quantidadeAlunos];// construtor adicionado para inicializar o array
    }
    public void adicionarAluno(Aluno aluno){
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }
    }
    public void listarAlunos(){
        for (Aluno aluno : this.alunos) {
            if (aluno != null) {
                System.out.println(aluno.nome);
            } else {
                System.out.println("Nenhum aluno na turma!!");
            }
        }
    }
    public Aluno buscarMelhorAluno(){
        Aluno melhorAluno = null;
        double melhorMedia = -1;
        for (Aluno aluno : this.alunos) {
            if (aluno != null && aluno.calculaMedia() > melhorMedia) {
                melhorMedia = aluno.calculaMedia();
                melhorAluno = aluno;
            }
        }
        if(melhorAluno != null){
            System.out.printf("Nome: " + melhorAluno.nome + "| Melhor média: " + String.format("%.2f",melhorMedia));//para deixar 2 casa decimais, eu coloco o formato que é "%.2f"
        } else{
            System.out.println("Nenhum aluno na turma");
        }
        return melhorAluno;
    }
}
