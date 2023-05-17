import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do Aluno: ");
        String nomeAluno = teclado.next();
        double nota1 = 0, nota2 = 0, media = 0;
        while(!nomeAluno.equals("fim")){
            System.out.print("Nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.print("Nota 2: ");
            nota2 = teclado.nextDouble();

            media = (nota1+nota2)/2;

            System.out.println("A média do aluno "+nomeAluno+
                               " é: "+media);
            
            System.out.println("Informe o nome do Aluno: ");
            nomeAluno = teclado.next();

        }

        teclado.close();

    }
}
