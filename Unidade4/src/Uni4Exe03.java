import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o primeiro número:");
        int numero1 = teclado.nextInt();

        System.out.print("Informe o segundo número:");
        int numero2 = teclado.nextInt();
        int maiorNumero;
        //Processo
        if (numero1 == numero2){
            System.out.println("Números iguais.");
        }else{
            if (numero1 > numero2){
                maiorNumero = numero1;
            }else{
                maiorNumero = numero2;
            }
            System.out.println(maiorNumero+" é o maior.");
        }
        
        teclado.close();
    }
}
