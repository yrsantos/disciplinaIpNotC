import java.util.Scanner;

public class Uni5Exe05_validacao {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Informe a quantidade de termos que deseja ler.");
            n = teclado.nextInt();
        }while(n <= 2);

//processo 

        teclado.close();
    }
}
