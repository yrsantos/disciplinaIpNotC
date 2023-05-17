public class Uni5Exe10 {
    public static void main(String[] args) {
        int soma = 0, resultado = 0, quantidade = 0;
        String termoFinal = "";
        for (int contador1 = 1; contador1 <= 10000;contador1++){
            for (int contador2 = 1; contador2 <= 10000; contador2++){
                soma = contador1+contador2;
                resultado = soma * soma;

                termoFinal = contador1+""+contador2;

                if (termoFinal.equals(resultado+"")){
                    
                    quantidade++;

                    System.out.println("["+quantidade+"]"+contador1+" + "+contador2+" = "+
                                       soma+ " -> "+soma+"² = "+
                                       resultado);
                                       
                    if (quantidade >= 10){
                        break;
                    }
                }

                if (quantidade >= 10){
                    break;
                }

            }
        }
    }
}
