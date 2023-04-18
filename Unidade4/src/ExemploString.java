public class ExemploString {

    public static void main(String[] args) {
        String nome = "Robson";
        String sobrenome = "Robson";
       

        if (nome.equals(sobrenome)){
            System.out.println("O nome é igual ao sobrenome");
        }else{
            System.out.println("nome é diferente do sobrenome");
        }
  /*
        //equals
        if (nome.equals("robson")){
            System.out.println("Equals - O nome é robson");
        }else{
            System.out.println("Equals - O nome não é robson");
        }

        //equalsIgnoreCase
        if (nome.equalsIgnoreCase("robson")){
            System.out.println("EqualsIgnoreCase - O nome é robson");
        }else{
            System.out.println("EqualsIgnoreCase - O nome não é robson");
        }
    */
    }
}