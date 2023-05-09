import java.util.Scanner;

public class ProvaC_q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String genero = teclado.next();

        if (genero.equals("")){
            System.out.println("dados incorretos");
        }else{
            int mesNascimento = teclado.nextInt();

            if (mesNascimento > 7){
                System.out.println("Nasceu no segundo semestre");
            }else{
                String texto = "Gênero"+genero+"Mês: "+mesNascimento;
                System.out.println(texto + " nasceu no primeiro semestre");
            }
        }


        teclado.close();
    }
}
