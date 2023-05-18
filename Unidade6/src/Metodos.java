import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        new Metodos();
    }

    //Sem retorno e  com parâmetro
    private void imprimirMensagem(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    //Com retorno e com parâmetro
    private String mostraMensagem(String mensagem) {
        return "Informação: " + mensagem;
    }

    //Construtor da classe:
    //o nome deve ser o mesmo nome que a classe
    public Metodos() {
        //Aqui deve-se implementar o que antes estava no main
        Scanner s = new Scanner(System.in);

        imprimirBoasVindas();
        
        imprimirMensagem("Olá!");
        imprimirMensagem("Seja bem vindo, tudo bem?");
        System.out.print("Digite uma mensagem: ");
        String mensagem = s.nextLine();
        imprimirMensagem(mensagem);

        System.out.println(informarMensagem());
        System.out.println("Conteúdo: " + informarMensagem());
        String dados = informarMensagem() + " " + mensagem;
        System.out.println(dados);

        dados = informarMensagem() + " " + mostraMensagem(mensagem);
        System.out.println(dados);

        s.close();
    }

    //sem retorno e sem parâmetros
    private void imprimirBoasVindas() {
        System.out.println("Bom dia!");
    }

    //com retorno e sem parâmetro
    private String informarMensagem() {
        return "Bom dia!";
    }



    

}
