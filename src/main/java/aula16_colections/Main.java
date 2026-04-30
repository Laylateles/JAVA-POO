package aula16_colections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List listaGenerica = new ArrayList<>();
        listaGenerica.add(1);
        listaGenerica.add("Inatel");
        listaGenerica.add(21.55f);
        listaGenerica.add(true);

        listaGenerica.add(listaGenerica.size(),"String");
        System.out.println(listaGenerica);

        int elemento = (int)listaGenerica.get(0);// conversão explícita, só posso fazer isso quando tenho ctz de qual é o tipo do argumento na lista

        System.out.println(elemento);

        List<String> listaString = new ArrayList<>();// criando uma lista que só aceita tipo string
        listaString.add("String");
        listaString.add("Inatel");
        listaString.add("POO");
        //listaString.add(1); -- da erro
        String elementString =  listaString.get(2);// desde que tenha algo nessa posição, ele não da erro
        System.out.println(elementString);
        System.out.println(listaString);

        for(String texto : listaString){// for-each percorre toda minha lista
            System.out.println(texto);
        }

        for(int i = 0; i < listaString.size(); i++){
            System.out.println(listaString.get(i));// tenho que usar o .get para acessar
        }
        listaString.forEach((texto) -> {
            System.out.println(texto);
        });

        List<Doce> doces = new ArrayList<>();
        Bolo bolo = new Bolo();
        Pudim pudim = new Pudim();
        Brigadeiro brigadeiro = new Brigadeiro();
    }
}
