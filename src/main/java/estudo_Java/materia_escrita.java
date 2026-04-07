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
System.out.print("ola") // imprime o texto sem pular linha
System.out.println("teste") // imprime o texto e pula para a próxima linha
System.out.printf("Olá %s\n", "Flavio") // imprime o texto e permite formatação de texto
System.out.printf("Nota: %.2f\n" , 9.5) // imprime com 2 casas decimais

->> Entrada de dados:
Para digitar valores no teclado e interagir com o programa, precisamos usar a classe
Scanner. Para isso é necessário fazer a imortação da biblioteca: java.util.Scanner; -- mas o próprio programa faz
Para usar a classe Scanner precisamos criar um objeto a partir dela => Scanner teclado = new Scanner(System.in);
teclado.nextLine(); -- para limpar o buffer do enter
Para cada tipo de variável é necessário usar um método diferente
Utilizamos a virgula para números decimais!! A não ser que eu mude a linguagem do meu programa!!!

->> Estruturas de Decisão: mesma estrutura que nas outras linguagens
if-else
switch(){ case 1: break; case 2: break; default: break;}

->> Estruturas de Repetição:
While => verifica a condição primeiro e executa caso seja verdadeira
Do while => executa ao menos uma vez e verifica a condição, caso seja vdd executa dnv
For => define uma variável de controle e executa até que a condição atrelada a essa variável seja falsa

O break pode ser utilizado para interromper o loop caaso seja necessário, ele para antes que a condição principal seja falsa

->> Paradgmas de Programação:
Imperativo: Descreve como o programa deve executar passo a passo:
-Estruturado: organiza os fluxo com sequência, decisão e repetição
-Procedural: organiza o código em procedimento(funções)
-Orientado a objetos: organiza o programa em objetos

Declarativo: Descreve o que deve ser feito, não como fazer, o sistema tem autonomia sobre como executar,
o foco é menor no controle de fluxo e alteração de estado.
-Funcional: baseado em funções puras e imutabilidade;
-Lógico: baseado em regras, fatos e inferência, muito usado em IA

->> Orientação a Objetos:
E como se apresenta um objeto no mundo real com a programação orientada a objetos?:
Através da criação de classes, elas possuem elementos que descrevem qualquer objeto, como atributos(caractrísticas) e métodos(funções).

*/
