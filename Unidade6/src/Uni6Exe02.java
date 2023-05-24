import java.util.Scanner;

public class Uni6Exe02 {

   private Uni6Exe02(){
    Scanner teclado = new Scanner(System.in);

     final int tamanhoVetor = 12;
     double vetValores[] = new double[tamanhoVetor];

     ler(vetValores, teclado);

     double mediaGeral = calcularMedia(vetValores);

     imprimirValoresMaiorMedia(vetValores, mediaGeral);
     
    teclado.close();

   }

    private void ler(double vetorReal[], Scanner tec) {
        for (int i = 0; i < vetorReal.length; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetorReal[i] = tec.nextDouble();
        }
    }

    private double calcularMedia(double vetor[]){
        double somaValores = 0, media = 0;
        for (int i = 0; i < vetor.length;i++){
            somaValores += vetor[i];
        }
        
        media = somaValores/vetor.length; 
        return media;

    }

    private void imprimirValoresMaiorMedia(double vetor[], double media){
        System.out.println("Média: "+media);
        System.out.println("****** Valores Maior que a Média *****");
        for (int i = 0; i < vetor.length;i++){
            if (vetor[i] > media){
                System.out.println("VetorValores["+i+"] = "+vetor[i]);
            }    
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }

}
