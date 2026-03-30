package aula11;

public class Cantina {
    public String nome;
    public Salgado[] salgados = new Salgado[3];//array para armazenar 3 salgados

    public void addSalgado(Salgado novoSalgado){//método
        for (int i = 0; i < this.salgados.length;i++){ // aqui percorro o vetor de salgados
            if(this.salgados[i] == null){ // se o vetor na posição i for null ou seja vazio, eu adiciono o novo salgado
                this.salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostrarInfo(){
        System.out.println(this.nome);
        for (Salgado salgados: this.salgados){
            if (salgados != null){
                System.out.println(salgados.nome);// mostro o vetor que contem os salgados
            }
        }
    }

}
