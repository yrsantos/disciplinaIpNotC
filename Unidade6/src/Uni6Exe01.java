import java.util.Scanner;

public class Uni6Exe01 {
    
    private Uni6Exe01(){
        Scanner teclado = new Scanner(System.in);
        final int tamanhoVetor = 10;
       
        int vetNumeros[] = new int[tamanhoVetor];
        
        //Leitura
        lerVetor(vetNumeros, teclado);

  
        
        //escrita
        imprimirVetor(vetNumeros);

        teclado.close();

    }

    private void lerVetor(int vetor[], Scanner tec) {
        for (int i = 0; i < vetor.length;i++){
            System.out.println("Informe o "+(i+1)+"º número :");
            vetor[i] = tec.nextInt(); 
        }
    }

    private void imprimirVetor(int vet[]){
        for (int i = vet.length-1; i >= 0; i--){
            System.out.println("vetor["+i+"] = "+vet[i]);
        }
    }


    public static void main(String[] args) {
        new Uni6Exe01();
    }  
}
