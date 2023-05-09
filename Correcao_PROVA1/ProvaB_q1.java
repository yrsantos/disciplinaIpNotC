import java.util.Scanner;

public class ProvaB_q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cor = teclado.next();

        if (cor.equals("")){
            System.out.println("Valor inválido");
        }else{
            int numeroRGB = teclado.nextInt();
            if (numeroRGB < 255){
                System.out.println("Valor inválido");
            }else{
                int novaCor = numeroRGB +20;
                System.out.println("Cor: "+cor+"Nova cor: "+novaCor);
            }
        }

        teclado.close();
    }
}
