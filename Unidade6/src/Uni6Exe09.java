import java.util.Scanner;

public class Uni6Exe09 {
  
    private Uni6Exe09(){

        Scanner teclado = new Scanner(System.in);

        final int qtdClientes = 3;
        final int qtdPerguntas = 3;
        int matPesquisa[][] = new int[qtdClientes][qtdPerguntas];
        lerPerguntas(matPesquisa,teclado,qtdClientes);

        double media = notaMedia(matPesquisa,qtdClientes);
        double mediaHomem =  notaMediaHomem(matPesquisa,qtdClientes);

        System.out.println("A média de notas é : "+media);
        System.out.println("A média de notas dos Homens é : "+mediaHomem);
        teclado.close();
    }

    private void lerPerguntas(int matriz[][], Scanner tec, int qtdClientes){
        for(int cliente = 0; cliente < qtdClientes; cliente++){
            System.out.println((cliente+1)+" º Cliente:");
            System.out.println("sexo (1=feminino 2=masculino): ");
            matriz[cliente][0] = tec.nextInt();
            System.out.println("Nota (0 á 10): ");
            matriz[cliente][1] = tec.nextInt();
            System.out.println("Idade: ");
            matriz[cliente][2] = tec.nextInt();
            
        }

    }

    private double notaMedia(int matriz[][], int qtdClientes){
        //qual a nota média recebida pelo cinema;
        double somaNota = 0;
        for(int cliente = 0; cliente < qtdClientes; cliente++){
            somaNota += matriz[cliente][1];
        }

        return somaNota/qtdClientes;
    }

    private double notaMediaHomem(int matriz[][], int qtdClientes){
        //qual a nota média recebida pelo cinema;
        double somaNota = 0;
        int qtdHomens = 0;
        for(int cliente = 0; cliente < qtdClientes; cliente++){
            if (matriz[cliente][0] == 2){
                somaNota += matriz[cliente][1];
                qtdHomens++;    
            }
            
        }

        return somaNota/qtdHomens;
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
