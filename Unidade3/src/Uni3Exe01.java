import java.util.Scanner;

public class Uni3Exe01 {
   public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
//Entradas
    System.out.print("Informe a Largura:");
    double largura = teclado.nextDouble();

    System.out.print("Informe o comprimento:");
    double comprimento = teclado.nextDouble();

    //Processo
    double area = largura * comprimento;

    //Saídas 
    System.out.println("A área é: "+area);

    teclado.close();
   } 
}
/**
 * Caso Teste1
 * (E)largura: 25.4; comprimento: 14.8 (S) area = 375.92
 */
