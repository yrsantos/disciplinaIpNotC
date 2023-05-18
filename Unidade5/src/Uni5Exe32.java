import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o dia da semana que inicia o calendário(p):");
        int diaSemana = teclado.nextInt();
        System.out.println("Quantos dias possui o mês(n):");
        int qtdDiasMes = teclado.nextInt();
        int espacosVazio = diaSemana-1; 
        int qtdDiasSemana = 7;
        int diaMesAtual = 1;
        
        int qtdLinhas = (qtdDiasMes+espacosVazio)/qtdDiasSemana;

        if ((qtdDiasMes+espacosVazio)%qtdDiasSemana > 0){
            qtdLinhas++;
        }

        int linha = 1, coluna = 1;
        System.out.println("-----------------------------");
        System.out.println("| D | S | T | Q | Q | S | S |");
        System.out.println("-----------------------------");
        while(linha <= qtdLinhas){ //linhas
            coluna = 1;
            while(coluna <= qtdDiasSemana){//colunas
                if (espacosVazio > 0){
                    System.out.print("|   ");
                    espacosVazio--;
                }else{
                    if (diaMesAtual <= qtdDiasMes){
                        if (diaMesAtual <= 9){
                            System.out.print("|  "+diaMesAtual);
                        }else{
                            System.out.print("| "+diaMesAtual);
                        }
                        
                        diaMesAtual++;
                    }else{
                        System.out.print("|   ");
                    }
                    
                }
                coluna++;   
            }
            System.out.print("|");
            System.out.println();
            System.out.print("-----------------------------");
            System.out.println();
            linha++;
        }

        teclado.close();

    }
}
