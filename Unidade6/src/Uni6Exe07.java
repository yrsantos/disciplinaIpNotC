import java.util.Scanner;

public class Uni6Exe07 {
  
    //Contrutor
    private Uni6Exe07(){
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = 0;
        do{
            System.out.println("Informe a quantidade de"+
                            " números que deseja solicitar:");
            tamanhoVetor = teclado.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);

        int vetNumeros[] = new int[tamanhoVetor];

        ler(vetNumeros, teclado);
        imprimir(vetNumeros, "origem");
        ordenarVetor(vetNumeros);
        imprimir(vetNumeros, "ordenado");



        teclado.close();

    }
    
    private void ler(int vetor[], Scanner tec){
        int i = 0, numero = 0;
        while (i < vetor.length){
            System.out.print("Informe o "+(i+1)+" º número:");
            numero = tec.nextInt();

            if (!pesquisarNumero(vetor,numero,i)){
                vetor[i] = numero;
                i++;
            }

            /*boolean encontrou = pesquisarNumero(vetor,numero,i);
            
            if (!encontrou){
                vetor[i] = numero;
                i++;
            }*/

        }
    }

    private boolean pesquisarNumero(int vetor[], int numero, int indiceAtual ){
        for (int j = 0; j < indiceAtual; j++){
            if (vetor[j] == numero){
                System.out.println("Número já Existe.");
                return true;
            }
        } 
        
        return false;
    }

    private void ordenarVetor(int vetor[]){
        //implementar o método bolha
    }

    private void imprimir(int vetor[],String texto){
       System.out.println(); 
       System.out.print("Vetor "+texto+":");
       for(int i = 0; i < vetor.length; i++){
         System.out.print("["+vetor[i]+"]");
       }
        //Vetor origem: [0][4][2][6][3]
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
