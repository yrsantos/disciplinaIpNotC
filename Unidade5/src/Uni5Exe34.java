import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, qtdDiarias = 0;
        String nomeHospede = "";
        double valorPago = 0;
        int qtdContasEncerradas = 0;
        do{
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair.");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do hóspede: ");
                    nomeHospede = teclado.next();
                    System.out.println("Informe a quantidade de diárias: ");
                    qtdDiarias = teclado.nextInt();
                    valorPago = qtdDiarias * 50.00;
                    if (qtdDiarias < 15){
                        valorPago += 7.50 * qtdDiarias;
                    }else if (qtdDiarias == 15){
                        valorPago += 6.50 * qtdDiarias;
                    }else{
                        valorPago += 5.00 * qtdDiarias;   
                    }

                    System.out.println("Hóspede: "+nomeHospede+ 
                                       " Valor a Pagar: R$ "+valorPago);
                    qtdContasEncerradas++;
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: "+qtdContasEncerradas);
                    break;
                case 3:
                    System.out.println("Sistema Finalizado.");
                    break;
            }

        }while(opcao != 3);
        

        teclado.close();


    }
}
