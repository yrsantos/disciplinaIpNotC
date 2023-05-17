import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura = 0, somaAltura = 0;
        int qtdPessoas = 0;
        for (int pessoa = 1; pessoa <= 20; pessoa++){
            System.out.print("Informe a altura da "+pessoa+
                             "ª pessoa:");
            altura = teclado.nextDouble();
            somaAltura += altura;
            qtdPessoas++;
        }
        double mediaAltura = somaAltura/qtdPessoas;
        System.out.println("A média de altura:"+mediaAltura);
        teclado.close();
    }   
}
