import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade "+
                           "de números que deseja "+
                           "solicitar:");
        int n = teclado.nextInt();
        double numero = 0;
        //double maiorNumero = Double.MIN_VALUE;
        //double menorNumero = Double.MAX_VALUE;

        double maiorNumero = 0, menorNumero = 0;
        for (int contador = 1; contador <= n; contador++){
            System.out.println("Informe o "+contador+
                               "º número real:");
            numero = teclado.nextDouble();

            if (contador == 1){
                maiorNumero = numero;
                menorNumero = numero;
            }else{
                if (numero > maiorNumero){
                    maiorNumero = numero;
                }
    
                if (numero < menorNumero){
                    menorNumero = numero;
                }
            }
            

        }
        teclado.close();
    }
}
