import java.util.Scanner;

public class Uni6Exe04 {
    
    private Uni6Exe04(){
        Scanner teclado = new Scanner(System.in);
        final int tamanhoVetor = 10;
        int vetor1[] = new int[tamanhoVetor];
        int vetor2[] = new int[tamanhoVetor];
        int vetor3[] = new int[tamanhoVetor];
        
        lerVetor(vetor1, teclado,"*** Lendo Vetor 1 ***");
        lerVetor(vetor2, teclado,"*** Lendo Vetor2 ***");
        somaVetores(vetor1, vetor2, vetor3);

        imprimeVetor(vetor1,"1");
        imprimeVetor(vetor2, "2");
        imprimeVetor(vetor3, "3");

        teclado.close();
    } 
    
    private void lerVetor(int vetor[], Scanner tec, String texto){
        System.out.println(texto);
        for (int i = 0; i < vetor.length; i++){
            System.out.println("vetor["+i+"]: ");
            vetor[i] = tec.nextInt();
        }
    }

    private void somaVetores(int vet1[], int vet2[],int vet3[]){
        for (int i = 0; i < vet3.length; i++){
            vet3[i] = vet1[i]+vet2[i];
        }
    }

    private void imprimeVetor(int vetor[], String numeroVetor){
        System.out.println("******** IMPRIMINDO VETOR"+numeroVetor+" ********");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Vetor"+numeroVetor+"["+i+"] = "+vetor[i]);
        }
    }

    
    public static void main(String[] args) {
        new Uni6Exe04();    
    }
    
}
