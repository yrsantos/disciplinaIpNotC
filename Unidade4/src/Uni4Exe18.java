import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe o dia Pagamento:");    
       int diaPagamento = teclado.nextInt();

       System.out.println("Informe o dia do Vencimento:");
       int diaVencimento = teclado.nextInt();

       System.out.println("Informe o Valor da Prestação:");
       double valorPrestacao = teclado.nextDouble();
       double valorPagar = 0;

       if (diaPagamento <= diaVencimento){ //pagamento em dia
        //Aplica 10% desconto
         valorPagar = valorPrestacao * 0.9;
         System.out.println("pagamento está em dia.");
       }else if (diaPagamento <= diaVencimento+5){//pagou até cinco dias após vencimento
         //Não ganha desconto
         valorPagar = valorPrestacao;    
       }else{ //pagou com mais de 5 dias após o vencimento
          valorPagar = valorPrestacao +
                       (0.02 * valorPrestacao * (diaPagamento - diaVencimento -5));   

       }

       System.out.println("O valor a pagar é: "+valorPagar);
       
       teclado.close();
    }
}
