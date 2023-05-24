public class ExemploMatrizAula {
    public static void main(String[] args) {
        
        final int linha = 5, coluna = 3;

        int minhaMatriz[][] = new int[linha][coluna];

        int numero = 1; 

        for (int l = 0; l < minhaMatriz.length; l++){//linhas
            for (int c = 0; c < coluna; c++){//colunas
                minhaMatriz[l][c] = numero;
                numero++;
            }

        }

        for (int l = 0; l < minhaMatriz.length; l++){//linhas
            for (int c = 0; c < coluna; c++){//colunas
                if (minhaMatriz[l][c] < 10){
                    System.out.print("   "+minhaMatriz[l][c]);    
                }else{
                    System.out.print("  "+minhaMatriz[l][c]);
                }
                
            }
            System.out.println();

        }

        //Pesquisar Valor 48

        for (int l = 0; l < minhaMatriz.length; l++){//linhas
            for (int c = 0; c < coluna; c++){//colunas 
                if (minhaMatriz[l][c] == 48){
                    System.out.println("O número 48 existe na matriz.");
                }
            }
        }

    }
}
