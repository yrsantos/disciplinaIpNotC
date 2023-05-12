public class Repeticao {
    public static void main(String[] args) {
        //imprimir números de 1 a 5 em ordem crescente
        System.out.println("Exemplo FOR Crescente");
        for(int contador = 1; contador <=5; contador++){
            System.out.println(contador);
        }

        System.out.println("Exemplo FOR Decrescente");
        for (int contador = 5; contador >= 1;contador--){
            System.out.println(contador);
        }

        System.out.println("Exemplo While Crescente");
        int contador = 1;
        while (contador <= 5){
            System.out.println(contador);
            contador++;
        }

        System.out.println("Exemplo While Decrescente");
        contador = 5;
        while (contador >= 1){
            System.out.println(contador);
            contador--;
        }

        System.out.println("Exemplo Do-While Crescente");
        contador = 1;
        do{
            System.out.println(contador);
            contador++;
        }while(contador <= 5);

        System.out.println("Exemplo Do-While Decrescente");
        contador = 5;
        do{
            System.out.println(contador);
            contador--;
        }while(contador >= 1);
    }
}
