import java.util.Scanner;

public class Revisao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe os meses de admissão:");
        int quantidadeMeses = teclado.nextInt();

        System.out.println("Informe o salario:");
        double salario = teclado.nextDouble();
        
        double valorReajuste = 0, novoSalario = 0;
                
        if (quantidadeMeses < 12){ //5% acrescimo no salario
            valorReajuste = (salario*5)/100;
            novoSalario = salario + valorReajuste;
        }else if (quantidadeMeses >= 13 && quantidadeMeses <= 48){
            valorReajuste = (salario * 7)/100;
            novoSalario = salario+valorReajuste;
        }

        System.out.println("O valor do reajuste é: "+valorReajuste);
        System.out.println("O novo salário é: "+novoSalario);

        teclado.close();
    }
}
