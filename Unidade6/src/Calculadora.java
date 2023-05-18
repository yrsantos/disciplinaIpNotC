import java.util.Scanner;

public class Calculadora {

    public Calculadora() {
        Scanner teclado = new Scanner(System.in);
        
        float num1 = lerNumero("1", teclado);
        float num2 = lerNumero("2", teclado);

        System.out.print("Digite o sinal (+, -, /, *): ");
        char sinal = teclado.next().trim().charAt(0);

        float total = 0;
        switch (sinal) {
            case '+':
                total = somar(num1, num2);
                break;
            case '-':
                total = subtrair(num1, num2);
                break;
            case '*':
                total = multiplar(num1, num2);
                break;
            case '/':
                total = dividir(num1, num2);
                if (total == Float.MIN_VALUE) {
                    System.out.println("Erro ao dividir por 0!");
                }
                break;
            default:
                System.out.println("Sinal inválido");

        }

        System.out.println("Total " + total);

        teclado.close();
    }

    private float somar(float num1, float num2) {
        return num1 + num2;
    }

    private float subtrair(float num1, float num2) {
        return num1 - num2;
    }

    private float multiplar(float num1, float num2) {
        return num1 * num2;
    }

    private float dividir(float num1 , float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Float.MIN_VALUE;
        }
    }

    private float lerNumero(String valor, Scanner s) {
        System.out.print("Digite o número " + valor + ": ");
        return s.nextFloat();
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
