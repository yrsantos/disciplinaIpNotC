import java.util.Scanner;

public class ProvaA_q1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();

        if (nome.equals("")){
            System.out.println("Dados inválidos");
        }else{
            int anoNascimento = teclado.nextInt();
            if (anoNascimento < 1900){
                System.out.println("Dados inválidos");
            }else{
                int idade = 2023 - anoNascimento;
                System.out.println("Nome: "+nome+"Idade: "+idade);
            }   
        }


        teclado.close();
    }
}
