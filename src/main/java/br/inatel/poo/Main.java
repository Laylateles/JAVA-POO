package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args){
        Turma turma = new Turma(3);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "João";
        aluno2.nome = "Pedro";
        aluno3.nome = "Rafael";

        aluno1.adicionarNota(8.54);
        aluno1.adicionarNota(9.54);
        aluno1.adicionarNota(2.58);

        aluno2.adicionarNota(5.39);
        aluno2.adicionarNota(5.94);
        aluno2.adicionarNota(7.36);

        aluno3.adicionarNota(8.76);
        aluno3.adicionarNota(2.53);
        aluno3.adicionarNota(9.54);

        aluno1.adicionaMatricula("57.547F");
        aluno2.adicionaMatricula("86.598L");
        aluno3.adicionaMatricula("31.652M");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        aluno1.mostraInfo();
        aluno2.mostraInfo();
        aluno3.mostraInfo();

        turma.listarAlunos();
        turma.buscarMelhorAluno();

    }
}
