import java.util.Scanner;

public class ExemploChar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma letra:");
        char letra = teclado.next().charAt(0);
        //convertendo o caracter para maiusculo
        letra = Character.toUpperCase(letra);
        if (letra == 'A'){
            System.out.println("A letra informada é A");
        }else{
            System.out.println("Não é A");
        }
        


        System.out.print("Informe uma letra:");
        char letra2 = teclado.next().charAt(0);
        //convertendo o caracter para minusculo
        letra = Character.toLowerCase(letra2);
        if (letra == 'a'){
            System.out.println("A letra informada é A");
        }else{
            System.out.println("Não é A");
        }
        teclado.close();
    }
}
