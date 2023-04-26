import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe hora/minuto chegada (hh mm):");
        int horaChegada = teclado.nextInt();
        int minutoChegada = teclado.nextInt();

        System.out.println("Informe hora/minuto saída (hh mm):");
        int horaSaida = teclado.nextInt();
        int minutoSaida = teclado.nextInt();

        if (horaChegada >= 0 && horaChegada <= 24 &&
            minutoChegada >= 0 && minutoChegada <= 60 &&
            horaSaida >= 0 && horaSaida <= 24 && 
            minutoSaida >= 0 && minutoSaida <= 60){
          int minutosTotaisChegada = (horaChegada*60)+minutoChegada;
          int minutosTotaisSaida = (horaSaida*60)+minutoSaida;

          int minutosTotais = minutosTotaisSaida - minutosTotaisChegada;

          int horasTotais = minutosTotais/60;
          int minutosSobra = minutosTotais%60;

          if (minutosSobra >= 30){
            horasTotais = horasTotais+1;
          }
          double valorPagar = 0;
          switch (horasTotais) {
            case 0://5.00
            case 1: valorPagar = 5;                
                break;
            case 2: valorPagar = 5+5;
                break;
            case 3 : valorPagar = 5+5+7.5;    
                break;
            case 4 : valorPagar = 5+5+7.5+7.5;
                break;
            default: valorPagar = 25 + (10 * (horasTotais-4));
                break;
          }
        
          System.out.println("Valor a pagar é:"+valorPagar);
        }else{
            System.out.println("Hora ou minuto inválido");
        }


        teclado.close();
    }
}
