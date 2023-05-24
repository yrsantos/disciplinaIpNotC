
public class ExemploMetodosAula {
    
    //construtor
    private ExemploMetodosAula(){
        //todo o código que coloca no main antes

        int numero1 = 20, numero2 = 50;
        double resultadoSoma = somar(numero1, numero2);
        imprimirResultado(resultadoSoma);
        //System.out.println("O resultado da soma é: "+resultadoSoma);
    }

    //meus métodos

    //método com retorno
    private double somar(double num1, double num2){
        double resultado = num1+num2;
        return resultado;
    }    

    //método sem retorno
    private void imprimirResultado(double resultado){
        System.out.println("O resultado da soma é: "+resultado);
    } 

    //main
    public static void main(String[] args) {
        new ExemploMetodosAula(); 
    }
}
