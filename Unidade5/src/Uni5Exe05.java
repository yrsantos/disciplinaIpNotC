import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Informe a quantidade de termos que deseja ler.");
            n = teclado.nextInt();
        }while(n <= 2);

//processo 
        int termo = 8, termoAnterior = 8;
        String termoFinal = "";
        for (int contador = 1; contador <= n;contador++){
            if (!termoFinal.equals("")){
                termoFinal += ",";
            }
            termoFinal += termo;
           
           if (contador % 2 == 0){//par
                termo = termoAnterior*2;
           }else{//impar
                termoAnterior = termo;     
                termo += 2;
           }
        }
        System.out.println(termoFinal);

        teclado.close();
    }
}
