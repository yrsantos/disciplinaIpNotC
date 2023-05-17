import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas "+
                           "que deseja imprimir:");
        int qtdLinhas = teclado.nextInt();
        int numeroFloyd = 1;
        for (int linha = 1; linha <= qtdLinhas; linha++){
            for (int coluna = 1; coluna <= linha; coluna++){
                if (numeroFloyd < 10){
                    System.out.print(numeroFloyd+"   ");
                }else{
                    System.out.print(numeroFloyd+"  ");
                }
                
                numeroFloyd++;
            }
            System.out.println();

        }

        teclado.close();
    }
}
