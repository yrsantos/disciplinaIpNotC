import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a massa inicial(kg):");
        double massaInicial = teclado.nextDouble();
        double massa = massaInicial*1000;
        int tempo = 0;

        while (massa > 0.5){
            massa /= 2;
            tempo += 50;
        }

        System.out.println("Massa Incial(kg): "+massaInicial);
        System.out.println("Massa Final(gramas):"+massa);
        System.out.println("Tempo: "+tempo+" segundos");


        teclado.close();
    }
}
