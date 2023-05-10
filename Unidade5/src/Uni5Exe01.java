import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        for(int contador = 1; contador <= 20; contador++){
            System.out.print("Informe o "+contador+"º número:");
            numero = teclado.nextInt();

            if (numero % 2 == 0){//par
                System.out.println("É PAR.");
            }else{
                System.out.println("É IMPAR");
            }

        }

        teclado.close();
    }
}
