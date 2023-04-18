import java.util.Scanner;

public class Uni3Exe08_String {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a letra:");
        
        String letra = teclado.nextLine();

        if (letra.trim().equalsIgnoreCase("a") ||
            letra.trim().equalsIgnoreCase("e") ||
            letra.trim().equalsIgnoreCase("i") ||
            letra.trim().equalsIgnoreCase("o") ||
            letra.trim().equalsIgnoreCase("u")){
                System.out.println("É vogal");
        }else{
            System.out.println("Não vogal");
        }      
        
        /* VARIÁVEL CHAR
        char letra = teclado.next().charAt(0);
        letra = Character.toLowerCase(letra);
    
        if (letra == 'a' || letra == 'e' || 
            letra == 'i' || letra == 'o' ||
            letra == 'u'){
                System.out.println("É vogal");
        }else{
            System.out.println("NÃO é vogal");
        }
      */
    
        teclado.close();    
    }   
}
