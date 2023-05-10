import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0;

        for(int contador = 1; contador <= 100;contador++){
            if (contador % 2 == 0){
                //par
                somaPar += contador;
            }else{
                //ímpar
                somaImpar += contador;

            }
        }

        System.out.println("A soma dos Pares: "+somaPar);
        System.out.println("A Soma do Ímpares: "+somaImpar);
        teclado.close();
    }
}
