import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        boolean mostrarResultado = true;

        System.out.println("Informe o número 1:");
        numero1 = teclado.nextInt();
        System.out.println("Operação: ");
        System.out.println("Soma           +");
        System.out.println("Subtração      -");
        System.out.println("Multiplicação  *");
        System.out.println("Divisão        /");
        char operacao = teclado.next().charAt(0);

        System.out.println("Informe o número 2:");
        numero2 = teclado.nextInt();

        double resultado = 0;

        switch (operacao) {
            case '+': // soma
                resultado = numero1 + numero2;
                break;
            case '-': // Subtração
                resultado = numero1 - numero2;
                break;
            case '*': // Multiplicação
                    resultado = numero1 * numero2;
                break;
            case '/': // Divisão
                    if (numero2 > 0){
                        resultado = numero1 / numero2;
                    }else{
                        mostrarResultado = false;
                        System.out.println("Não é possível dividir por ZERO!");
                    }
                    
                break;
            default:
                    mostrarResultado = false;
                    System.out.println("Operação inválida!");
                break;
        }
        
        //Saída
        if (mostrarResultado){
            System.out.println("O Resultado é: "+ resultado);
        }
        
        teclado.close();
    }
}
