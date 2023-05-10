public class CadeadoRepeticao {
    public static void main(String[] args) {
        int totalPossibilidades = 0;
        for (int sequencia1 = 0; sequencia1 <= 9;sequencia1++){
            for(int sequencia2 = 0; sequencia2 <= 9; sequencia2++){
                for(int sequencia3 = 0; sequencia3 <= 9; sequencia3++){
                    for(int sequencia4 = 0; sequencia4 <= 9; sequencia4++){
                        System.out.println("["+sequencia1+","+
                                              sequencia2+","+
                                              sequencia3+","+
                                              sequencia4+"]");
                        totalPossibilidades++;
                    }
                }
            }
        }

        System.out.println("Quantidade de possibilidades de senhas: "+totalPossibilidades);
    }
}
