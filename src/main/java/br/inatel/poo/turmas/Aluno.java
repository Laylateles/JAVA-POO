package br.inatel.poo.turmas;

public class Aluno {
    public String nome;
    private String matricula;
    private double[] notas = new double[3];

    public void adicionaMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adicionarNota(double notas) {//posso alterar
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] == 0) {
                this.notas[i] = notas;
                break;
            }
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public double calculaMedia() {
        double soma = 0;
        double media;
        for (double nota : this.notas) {
            soma += nota;
        }
        media = soma/this.notas.length;
        return media;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        for (double nota : this.notas) {
            System.out.println("Nota: " + nota);
        }
        System.out.println("Matrícula: " + getMatricula());
        System.out.printf("Média: " + String.format("%.2f",this.calculaMedia()));
        System.out.println();// só para pular uma linha entre um aluno e outro
        System.out.println("---------------------------------");
    }
}

