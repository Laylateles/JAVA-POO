package estudo_Java;// para organizar as classes

public class materia_escrita { // tudo acontece dentro desta classe
    public static void main(String[] args){
        System.out.println("Hello Word!");
    }
}// matéria escrita:
/* O java é uma linguagem fortemente tipada:
-> ele obrigada você a declarar o tipo da sua variável na declaração

->>variáveis e tipos primitivos:
boolean isActive = true; -- lógico
byte age = 28; -- inteiro
short year = 1998; -- inteiro
int day = 21; -- inteiro
long month = 2; -- inteiro
float height = 1.58f; -- ponto flutuante
double width = 2.56; -- ponto flutuante
char letter = 'F'; -- carácter

->>classe String:
String name = "Roberto";

métodos da classe String:
name.lenght(); -- mostra o tamanho
name.toUpperCase(); -- coloca tudo em maiúsculo
name.toLowerCase(); -- coloca tudo em minúsculo
name.startsWith("X"); -- verifica se começa com uma determinada String
name.equalsIgnoreCase("Java"); -- compara duas string
name.replace("Roberto", "João"); -- troca a string "Roberto" por "João"

->>inferência de tipo: o compilador descobre automaticamente o tipo da variável com base
no valor atribuído -- uso o var --
nesse caso é obrigatório a declaração e atribuição NÃO POSSO: var teste;

->>para deixar com duas casas decimais:
System.out.printf("Nota: %.2f\n", 9.5); -- não funciona com var

->>Casting e Promoções:
Não é possível atribuir valores de tipos diferentes do tipo da variável
declarada, exemplo:
int idade;//declaração
idade = 20; //atribuição correta -- atribui um numero inteiro em uma variavel do tipo int
idade = "20"; // atribuição errada -- atribui uma STRING para uma variável do tipo INT

->conversão explícita: Casting
exemplo:
double pi = 3.1415;
int number = (int) pi; // converti o double pi para int pi e atribui o resultado a variavel number

a conversão de String para um número é mais complexo pois exige o uso de métodos para a conversão:
int idade = Integer.parseInt("20");

->conversão implícita : Promoção(casting automático)
int idade = 20;
long idade1 = idade; // aqui não teve conflito porque o tipo long é maior que o tipo int,então int "cabe" dentro de long
byte -> short -> int -> long -> float -> double

->> Saída de dados:
*/
