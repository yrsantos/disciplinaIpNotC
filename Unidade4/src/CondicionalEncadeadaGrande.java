public class CondicionalEncadeadaGrande {
  public static void main(String[] args) {
     int idade = 7;
     
     if (idade >= 18){
        System.out.println("Adulto");
     }else{
        if (idade >= 6){
            System.out.println("Adolecente");
        }else{
            System.out.print("Infantil");
        }
     }

     System.out.println("..FIM..");


  }  
}
