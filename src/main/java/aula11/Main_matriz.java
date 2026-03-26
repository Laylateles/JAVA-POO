package aula11;

public class Main_matriz {
    public static void main(String[] args){
        // matriz:
        int [][] matriz = new int[5][5];// 3 linhas e 2 colunas
        // preciso de 2 for para ler a matriz, um para ler a linha e um para ler a coluna
        for(int i=0;i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length ; j++){
                matriz[i][j] = i + j;
            }
        }

      /*  for(int i=0;i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j] + " ");// tenho que colocar print para sair um do lado do outro
            }
            System.out.println();
        }*/

        //matriz identidade:
        for(int i=0;i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length ; j++){
                if(i == j)
                    matriz[i][j] = 1;
                 else
                    matriz[i][j] = 0;
                System.out.print(matriz[i][j] + " ");// tenho que colocar print para sair um do lado do outro
            }
            System.out.println();
        }
    }
}
