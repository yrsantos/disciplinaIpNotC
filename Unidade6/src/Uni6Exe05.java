import java.security.PrivilegedActionException;
import java.util.Scanner;

public class Uni6Exe05 {
   //construtor
   private Uni6Exe05(){
     Scanner teclado = new Scanner(System.in);
     final int tamanhoVetor = 5;

     String vetRapaz[] = new String[tamanhoVetor];
     String vetMoca[] = new String[tamanhoVetor];
     String vetPerguntas[] = {"Gosta de música sertaneja?",
                              "Gosta de futebol?",
                              "Gosta de seriados?",
                              "Gosta de redes sociais?",
                              "Gosta da Oktoberfest?"};

     lerPerguntas(vetRapaz,teclado, "DO RAPAZ", vetPerguntas);
     lerPerguntas(vetMoca, teclado, "DA MOÇA", vetPerguntas);

     int afinidade = calcularAfinidade(vetRapaz, vetMoca);

     imprimeResultado(afinidade);

     teclado.close();

   }

   private void lerPerguntas(String vetor[],Scanner teclado,
                             String Texto, String perguntas[]){
     System.out.println("*** LENDO RESPOSTAS "+Texto);
     System.out.println("** Para cada pergunta responda: SIM, NÃO ou IND (indiferente) ***");
     for (int i = 0; i < vetor.length; i++){
        System.out.println(perguntas[i]);
        vetor[i] = teclado.next();
     }
   }

   private int calcularAfinidade(String vetRapaz[], String vetMoca[]){
     int afinidade = 0;

     for (int i = 0; i < vetRapaz.length; i++){
        if (vetRapaz[i].equalsIgnoreCase(vetMoca[i])){
            afinidade += 3;
        }else if (vetRapaz[i].equalsIgnoreCase("IND") ||
                  vetMoca[i].equalsIgnoreCase("IND")){
            afinidade++;
        }else{
           afinidade -= 2;  
        }
     }

    return afinidade;
   }

   private void imprimeResultado(int afinidade){
     if (afinidade == 15){
        System.out.println("Casem!");
     }else if (afinidade >= 10 && afinidade <= 14){
        System.out.println("Vocês têm muita coisa em comum!");
     }else if (afinidade >= 5 && afinidade <= 9){
        System.out.println("Talvez não dê certo :(");
     }else if (afinidade >= 0 && afinidade <= 4){
        System.out.println("Vale um encontro.");
     }else if (afinidade >= -9 && afinidade <= -1){
        System.out.println("Melhor não perder tempo");
     }else if (afinidade == -10){
        System.out.println("Vocês se odeiam!");
     }

   }


   public static void main(String[] args) {
      new Uni6Exe05(); 
   }
   
   
}
