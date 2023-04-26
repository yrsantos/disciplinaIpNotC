import java.util.Scanner;

public class Revisao01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o sexo:");
    char sexo = teclado.next().charAt(0);
    sexo = Character.toUpperCase(sexo);

    switch (sexo) {
        case 'M':
                System.out.println("Masculino");
                break;
        case 'F':
                System.out.println("Feminino");
                break;
        case 'I' : 
                System.out.println("Não Informado");
                break;
        default:
                System.out.println("Entrada Incorreta");
            break;
    }

    teclado.close();
  }  
}
