import java.util.Scanner;

public class ProvaC_q2 {


   public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     System.out.print("Código: ");
     char codigo = teclado.next().charAt(0);
     codigo = Character.toUpperCase(codigo);
     System.out.print("Quantidade(ml): ");
     int quantidade = teclado.nextInt();
     String ingrediente = "";
     int percentualAcrescimo = 0;

     switch (codigo) {
        case 'A':
            if (quantidade > 400){
                System.out.println("A quantidade inicial de fubá não pode ser superior a 400g");
            }else{
                ingrediente = "fubá";
                percentualAcrescimo = 10;
            }
            
            break;
        case 'B':
            if (quantidade < 100 || quantidade > 1000){
                System.out.println("A quantidade inicial de arroz deve ser entre 100g e 1000g");
            }else{                
                ingrediente = "arroz";
                percentualAcrescimo = 20;
            }
        
            break;
        case 'C':
            if (quantidade < 100 || quantidade > 1000){
                System.out.println("A quantidade inicial de cereal deve ser entre 100g e 1000g");
            }else{                
                ingrediente = "cereal";
                percentualAcrescimo = 30;
            }
          
            break;
        case 'D':
            if (quantidade > 300){
                System.out.println("A quantidade inicial de linhaça não pode ser superior a 300g");
            }else{
                ingrediente = "linhaça";
                percentualAcrescimo = 30;
            }
            break;
        case 'E':
            if (quantidade > 800){
                System.out.println(" A quantidade inicial de trigo não pode ser superior a 800g");
            }else{
                ingrediente = "trigo";
                percentualAcrescimo = 80;
            }
            break;
        case 'F':
            System.out.println("Não aumenta");
            break;
        default:
            System.out.println("Código inválido");
            break;
     }

     if (percentualAcrescimo > 0){
        System.out.println("Ingrediente: "+ingrediente);
        int valorAcrescimo = (quantidade * percentualAcrescimo)/100;
        int valorTotal = quantidade+valorAcrescimo;

        System.out.println("Percentual acréscimo: "+valorAcrescimo+"g");
        System.out.println("Total: "+valorTotal+"g");
     }
     
     teclado.close();
   } 


}
