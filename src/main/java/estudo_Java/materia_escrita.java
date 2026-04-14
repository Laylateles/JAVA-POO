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
Exemplo Classe Animal: Atributos= Cor, Nome, Ano de Nascimento, Altura, Nome do Dono
Métodos= Andar, comer, dormir, brincar;
Pode-se criar(instanciar) os objetos cachorro, gato,tigre,elefante a partir da classe Animal
Uma classe é como uma "forma de bolo para criar tipos de objetos"

A especificação é a classe e as instâncias são os objetos criados a partir da classe
Da mesma forma que temos os tipos primitivos(int,char), temos os tipos complexos que são as variáveis
do tipo de uma classe, os objetos.

->> Referência:
Stack => possui o comportamento de pilha e é utilizada para empilhar variáveis locais, referências de objetos armazenados
na HEAP e chamadas para métodos -- var c1 e c2

Heap => possui o comportamento de alocação dinâmica, ela armazena objetos criados e seus atributos, arrays, entre outras estruturas de dados criadas
dinamicamente durante a execução do programa.  -- endereço de memória dessas variáveis

->> UML:
é uma linguagem visual para especificação, visualização e documentação de software, em blocos:
nome da classe
membros da classe
métodos da classe
-- modificadores de acesso: + public, - private, # protected

->> Relacionamento entre objetos: -- Associação
- Uma associação representa um relacionamento entre objetos, indicando que eles se conhecem ou se utilizam
Pode ocorrer da seguinte forma:
* Quando um objeto possui outro objeto(o relacionamento "tem um")
* Quando um objeto utiliza outro para executar uma ação

Agregação=> conta (losango branco)---- cliente, a conta possui os dados do cliente, o cliente pode existir independentemente de uma conta existir
a classe conta recebe o Cliente titular; -- crio uma variavel do tipo Cliente dentro da classe conta
Composição=> empres (losango preto)---- departamento, não existe departamento sem empresa, porém uma empresa pode existir sem departamento

->> Arrays no Java:
Como podemos declarar um array: int w []; int []x; int [] y; int z[]; arrays que vão armazenar informações do tipo inteiro
Como podemos inicializar um array no Java: int x[] = new int[10]; cria array de 10 posições do tipo inteiro, int z[] = {2,3,6,4}; array com 4 posições ja iniciado com valores
Stack => guarda variáveis, referências e controle de execução.--possui comportamente de pilha
Heap => guardas objetos, atributos dos objetos e arrays. -- possui alocação dinâmica conforme a disponiblidade
Para percorrer um array:
for(int i = 0; i < contas.length; i++){//lopp for tradicional
if(contas[i] == null){
break;
    }
 System.out.println(contas[i].saldo);
}
for(Conta c : contas){// for-each
if(c == null){// preciso colocar essa condição pois eu ainda não inicializei meu vetor contas com valores
break;
    }
  System.out.println(c.saldo);
}

Um objeto pode se relacionar com uma lista de objetos de outra classe.

->> Matriz:
int [][] matrizEx = new int[5][5]; -- criei uma matriz com 5 linhas e 5 colunas
for(int i = 0; i < matrizEx.length; i++){// para ler as linhas
    for(int j = 0; j < matrizEx[i].length; j++){ // para ler as colunas
        matrizEx[i][j] = i + j;
     }
}

->> Pacotes:
No java, os pacotes se comportam exatamente como pastas do computador;
Assim como as pastas contém nossos arquivos, os pacotes contém as classes.
O padrão da Sun(empresa que criou o Java) para dar nome aos pacotes é relativo ao nome da empresa que desenvolveu a classe. Exemplos:
br.com.nomedaempresa.nomedoprojeto.subpacote
br.com.nomedaempresa.nomedoprojeto.subpacote2
br.com.nomedaempresa.nomedoprojeto.subpacote2.subpacote3
Cada "." (ponto) indica um novo subpacote, isto é, pacote dentro de pacote.
O package sempre fica no começo do arquivo, ele informa em qual pacote está nossa classe
Em seguida temos o "import" informando quais outras classes estamos usando.

->> Modificadores de Acesso:
private => permite que os membros da classe seja acessados apenas dentro da própria classe
getters e setters => mostra, edita

->> Construtores:
Quando usamos a palavra reservada "new" para instanciar um novo objeto de uma determinada classe, estamos também invocando o construtor desta classe
que cria a sua instância, por isso o nome "construtor", pois ele constroi

->> Static: modificador,pertence a classe e não a instância
A palavra reservada "this" aponta para os atributos e métodos das instâncias, não para atributos ou métodos da
classe que são estáticos
*/
