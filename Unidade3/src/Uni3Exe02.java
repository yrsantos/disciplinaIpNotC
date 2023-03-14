import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    DecimalFormat df = new DecimalFormat("0.00");
     
    //Entradas
        System.out.println("Preço Sapato:");
        double precoSapato = teclado.nextDouble();
        double desconto = 0.12;

     //Processo
      double valorDesconto = precoSapato * desconto; 
      double valorTotal = precoSapato - valorDesconto;
     //Saídas

     System.out.println("O valor do desconto é de R$ "+df.format(valorDesconto));
     System.out.println("O preço do par de sapatos com desconto é R$ "+df.format(valorTotal));
     //
     teclado.close();
   } 
}

/**
 * Caso Teste1
 * (E) precoSapato: 180.99  (S) valorDesconto=21,7188;valorTotal=159.2712  
 */
