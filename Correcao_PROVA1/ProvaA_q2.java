import java.util.Scanner;

public class ProvaA_q2 {
   public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     System.out.print("Código: ");
     char codigo = teclado.next().charAt(0);
     codigo = Character.toUpperCase(codigo);
     System.out.print("Quantidade(g): ");
     int quantidade = teclado.nextInt();
     String ingrediente = "";
     int percentualAcrescimo = 0;

     switch (codigo) {
        case 'A':
            if (quantidade > 1000){
                System.out.println("A quantidade inicial de trigo não pode ser superior a 1000g");
            }else{
                ingrediente = "trigo";
                percentualAcrescimo = 100;
            }
            
            break;
        case 'B':
            if (quantidade < 200 || quantidade > 500){
                System.out.println("A quantidade inicial de polvilho doce deve ser entre 200g e 500g");
            }else{                
                ingrediente = "polvilho doce";
                percentualAcrescimo = 80;
            }
        
            break;
        case 'C':
            if (quantidade < 200 || quantidade > 500){
                System.out.println("A quantidade inicial de polvilho azedo deve ser entre 200g e 500g");
            }else{                
                ingrediente = "polvilho azedo";
                percentualAcrescimo = 80;
            }
          
            break;
        case 'D':
            if (quantidade > 100){
                System.out.println("A quantidade inicial de polenta não pode ser superior a 100g");
            }else{
                ingrediente = "polenta";
                percentualAcrescimo = 50;
            }
            break;
        case 'E':
            if (quantidade > 500){
                System.out.println("A quantidade inicial de açúcar não pode ser superior a 500g");
            }else{
                ingrediente = "açúcar";
                percentualAcrescimo = 30;
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
