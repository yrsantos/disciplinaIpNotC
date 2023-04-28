public class ExemploRepeticao {
   public static void main(String[] args) {
        
        //PARA
        /*for (inicializacao; condição; finalização) {

        }*/
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador);
        }


        System.out.println("ENQUANTO");
        //ENQUANTO
        int contador = 11;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("REPITA");
        //REPITA
        contador = 11;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

   } 
}
