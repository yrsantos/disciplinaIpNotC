import java.util.Scanner;

public class ExemploBoolean {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Vai chover?: ");
        boolean vaiChover = teclado.nextBoolean();

        if (vaiChover){
            System.out.println("Sim, Vai Chover.");
        }else{
            System.out.println("Não vai chover");
        }

        teclado.close();
    }
}
