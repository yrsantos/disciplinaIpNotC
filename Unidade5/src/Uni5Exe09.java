import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos:");
        int qtdAlunos = teclado.nextInt();
        String nomeAluno = "", nomeAlunos18Anos = "";
        int idadeAluno = 0, qtdAlunosMaior20 = 0;


        for (int contador = 1; contador <= qtdAlunos; contador++){
            System.out.print("Informe o nome do "+contador+" º aluno:");
            nomeAluno = teclado.next();
            System.out.print("Informe a idade do "+contador+"º aluno:");
            idadeAluno = teclado.nextInt();

            if (idadeAluno == 18){
                nomeAlunos18Anos += nomeAluno+ " - "; 
            }

            if (idadeAluno > 20){
                qtdAlunosMaior20++;
            }
        }

        System.out.println("Alunos com 18 anos: "+nomeAlunos18Anos);
        System.out.println("Quantidade alunos com "+
                           " idade acima de 20 anos:"+qtdAlunosMaior20);
        teclado.close();
    }
}
