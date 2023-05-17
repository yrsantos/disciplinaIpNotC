import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o Canal (4, 5, 9, 12): ");
        int canal = teclado.nextInt();
        int qtdPessoas = 0;
        int qtdCanal4 = 0, qtdCanal5 = 0, qtdCanal9 = 0, qtdCanal12= 0; 
        int totalPessoas = 0;

        while (canal != 0){
            System.out.println("Informe a quantidade de Pessoas: ");
            qtdPessoas = teclado.nextInt();
            totalPessoas += qtdPessoas;

            switch (canal) {
                case 4:
                    qtdCanal4 += qtdPessoas;
                    break;
                case 5:
                    qtdCanal5 += qtdPessoas;
                    break;
                case 9:
                    qtdCanal9 += qtdPessoas;
                    break;
                case 12:
                    qtdCanal12 += qtdPessoas;
                    break;
            }
            System.out.println("Informe o Canal (4, 5, 9, 12): ");
            canal = teclado.nextInt();
        }

        double percCanal4 =  (qtdCanal4*100)/(double)totalPessoas;
        double percCanal5 =  (qtdCanal5*100)/(double)totalPessoas;
        double percCanal9 =  (qtdCanal9*100)/(double)totalPessoas;
        double percCanal12 =  (qtdCanal12*100)/(double)totalPessoas;
        
        System.out.println("Percentual de audiência das Emissoras:");
        System.out.println("Canal4: "+percCanal4+ " %");
        System.out.println("Canal5: "+percCanal5+ " %");
        System.out.println("Canal9: "+percCanal9+ " %");
        System.out.println("Canal2: "+percCanal12+ " %");


        teclado.close();
    }
}
