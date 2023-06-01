import java.util.Scanner;

public class Uni6Exe08 {
    private Uni6Exe08(){
        Scanner teclado = new Scanner(System.in);
        
        int tamanhoVetor = 0;
        do{
            System.out.println("Informe a quantidade de"+
                            " números que deseja solicitar:");
            tamanhoVetor = teclado.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);

        double vetNumeros[] = new double[tamanhoVetor];

        ler(vetNumeros,teclado);
        imprimir(vetNumeros);
        imprimirFrequencia(vetNumeros);



        teclado.close();
    }

    private void ler(double vetor[], Scanner tec){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Informe o "+(i+1)+" º valor:");
            vetor[i] = tec.nextDouble();
        }
    }
    
    private void imprimir(double vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println();
    }

    private void imprimirFrequencia(double vetor[]){
        int contador = 0;
        boolean vetEncontrou[] = new boolean[vetor.length];

        System.out.println("VALOR  |  FREQUENCIA");
        for(int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length;j++){
                if (!vetEncontrou[j]){
                    if (vetor[i] == vetor[j]){
                        contador++;
                        vetEncontrou[j] = true;
                    }
                }
                
            }

            if (contador > 0){
                System.out.println(vetor[i] + "  |  "+contador);
                contador = 0;
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
