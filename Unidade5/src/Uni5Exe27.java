import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int novoFuncionario = 1;
        int diaMes = 0, qtdProducaoDia = 0;
        int qtdProducaoManha = 0, qtdProducaoTarde = 0;
        double valorRecebido = 0;
        int diaMaiorProducao = 0, qtdMaiorProducao = 0,
            qtdProduzidaTurno = 0;
        String turnoMaiorProducao = "";  

        while(novoFuncionario == 1){
            
            do{
                System.out.println("Informe o dia (1 a 30):");
                diaMes = teclado.nextInt();

                if (diaMes < 1 || diaMes > 30){
                    System.out.println("Dia inválido");
                }
            }while(diaMes < 1 || diaMes > 30);
            
            System.out.print("Quantidade produção Manhã: ");
            qtdProducaoManha = teclado.nextInt();

            System.out.print("Quantidade produção Tarde: ");
            qtdProducaoTarde = teclado.nextInt();
            
            qtdProducaoDia = qtdProducaoManha+qtdProducaoTarde;

            if (qtdProducaoDia > qtdMaiorProducao){
                qtdMaiorProducao = qtdProducaoDia;
                diaMaiorProducao = diaMes;
                if (qtdProducaoManha > qtdProducaoTarde){
                    turnoMaiorProducao = "Manhã";
                    qtdProduzidaTurno = qtdProducaoManha;
                }else{
                    turnoMaiorProducao = "Tarde";
                    qtdProduzidaTurno = qtdProducaoTarde;
                }         


            } 
            
            if (diaMes <= 15){//primeira quinzena
                if (qtdProducaoDia > 100 && 
                    qtdProducaoManha >= 30 && 
                    qtdProducaoTarde >= 30){
                        valorRecebido = 0.80 * qtdProducaoDia;
                }else{
                    valorRecebido = 0.50 * qtdProducaoDia;
                }
            }else{//segunda quinzena
                valorRecebido = 0.40 * qtdProducaoManha;
                valorRecebido += 0.30 * qtdProducaoTarde;
            }

            System.out.println("R$ "+df.format(valorRecebido)+
                               " (valor recebido)");
             
            System.out.println("Novo funcionário: (1.sim 2.não)?");
            novoFuncionario = teclado.nextInt();

        }

        System.out.println("O dia da maior produção: "+diaMaiorProducao);
        System.out.println("Periodo que mais produziu: "+turnoMaiorProducao+
                           " e a quantidade produzida foi: "+qtdProduzidaTurno);


        teclado.close();

    }
}
