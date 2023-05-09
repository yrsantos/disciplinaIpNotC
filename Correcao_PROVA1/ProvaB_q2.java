import java.util.Scanner;

public class ProvaB_q2 {

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
            if (quantidade > 1000){
                System.out.println("A quantidade inicial de leite não pode ser superior a 1000ml");
            }else{
                ingrediente = "leite";
                percentualAcrescimo = 90;
            }
            
            break;
        case 'B':
            if (quantidade < 300 || quantidade > 600){
                System.out.println("A quantidade inicial de azeite deve ser entre 300ml e 600ml");
            }else{                
                ingrediente = "azeite";
                percentualAcrescimo = 50;
            }
        
            break;
        case 'C':
            if (quantidade < 300 || quantidade > 600){
                System.out.println("A quantidade inicial de oleo deve ser entre 300ml e 600ml");
            }else{                
                ingrediente = "oleo";
                percentualAcrescimo = 50;
            }
          
            break;
        case 'D':
            if (quantidade > 200){
                System.out.println("A quantidade inicial de vinagre não pode ser superior a 200ml");
            }else{
                ingrediente = "vinagre";
                percentualAcrescimo = 20;
            }
            break;
        case 'E':
            if (quantidade > 1000){
                System.out.println("A quantidade inicial de iogurte não pode ser superior a 1000ml");
            }else{
                ingrediente = "iorgute";
                percentualAcrescimo = 10;
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

        System.out.println("Percentual acréscimo: "+valorAcrescimo+"ml");
        System.out.println("Total: "+valorTotal+"ml");
     }
     
     teclado.close();
   } 

}
