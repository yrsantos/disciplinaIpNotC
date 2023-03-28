import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       //Entrada
        System.out.println("Informe as horas trabalhadas no mês:");
        int horasMes = teclado.nextInt();
        System.out.println("Informe o valor hora R$:");
        double valorHora = teclado.nextDouble();
        //Processo
        double salario = horasMes * valorHora;
     
        if (horasMes > 160){
            double extra = (horasMes-160) * (valorHora/2);
            //salário total
            salario = salario + extra;
        }
        //Saída
        System.out.println("O salário total é: "+salario);
        
        teclado.close();
    }
}
