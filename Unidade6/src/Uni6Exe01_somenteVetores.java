import java.util.Scanner;

public class Uni6Exe01_somenteVetores {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    final int tamanhoVetor = 10;

    int vetNumeros[] = new int[tamanhoVetor];

    //Leitura
    for (int i = 0; i < vetNumeros.length;i++){
        System.out.println("Informe o "+(i+1)+"º número :");
        vetNumeros[i] = teclado.nextInt();
    }

    //escrita
    for (int i = vetNumeros.length-1; i >= 0; i--){
        System.out.println("vetor["+i+"] = "+vetNumeros[i]);
    }

    teclado.close();



  }  
}
