import java.util.Scanner;


public class ExemploVetorAula {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
/*
    final int tamanhoVetor = 4;

    int meuVetor[] = new int[tamanhoVetor];

    for (int i = 0; i < meuVetor.length; i++){
        System.out.println("Informe o indice "+i+
                           " do vetor: ");
        meuVetor[i] = teclado.nextInt();

    }

    for (int i = 0; i < meuVetor.length; i++){
        System.out.println("Vetor["+i+"] = "+meuVetor[i]);    
    }

*/

    int vetorNumeros[] = {88,96,7,8,70};
    System.out.println("tamanho do vetor: "+vetorNumeros.length);

    //char vetorLetras[] = {'A','b','@'};
    //String meuVetorCor[] = {"Azul","Amarelo","Verde"};
   /* String meuVetorCor[] = new String[5];
    meuVetorCor[0] = "Azul";
    meuVetorCor[1] = "Amarelo"; 

    char vetorLetras[] = char[3];
    vetorLetras[0] = 'A';
    */

    teclado.close();
  }   
}
