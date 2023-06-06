import java.util.Scanner;

public class Uni6Exe10 {

    //construtor
    private Uni6Exe10(){
        Scanner teclado = new Scanner(System.in);
        int vetNumeros[] = new int[50];   
        int opcao;
        int indiceAtual = 0;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir valor:");
            System.out.println("2 - Pesquisar valor:");
            System.out.println("3 - Alterar valor:");
            System.out.println("4 - Excluir valor:");
            System.out.println("5 - Mostrar valor:");
            System.out.println("6 - Ordenar valor:");
            System.out.println("7 - Inverter valores:");
            System.out.println("8 - Sair do Sistema:");
            
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1://incluir valor no vetor
                    indiceAtual = incluir(vetNumeros, indiceAtual,teclado);
                    
                    break;
                case 2: //pesquisar valor
                   int encontrou = pesquisar(vetNumeros, teclado, indiceAtual);
                   if (encontrou >= 0){
                     System.out.println("Número localizado.No indice ["+encontrou+"]");
                   }else{
                     System.out.println("Número NÃO localizado.");
                   } 
                   break;
                case 3 : 
                   alterar(vetNumeros,teclado,indiceAtual);
                   break;
                case 4 :
                   indiceAtual = excluir(vetNumeros, indiceAtual, teclado);
                   break;
                case 5 :
                   imprimir(vetNumeros,indiceAtual);
                   break;
                case 6 :// ordenar vetor
                    // criar um método para ordenar o vetor
                   break;
                case 7://inverter
                //criar um método para inverter o vetor
                  break; 
                case 8:
                   System.out.println("Sair do sistema");
                  break;
                default:
                    break;
            }
        }while(opcao != 8);
        
        teclado.close();
    }

    //Meus métodos

    //incluir(vetNumeros, indiceAtual,teclado);
    private int incluir(int vetor[],int indice, Scanner tec){
        if (indice < vetor.length){
            System.out.print("Informe número para o vetor["+indice+"]:");
            int numero = tec.nextInt();
            vetor[indice] = numero;
            indice++; 
            //tem espaço
        }else{
            System.out.println("Vetor Cheio. Valor não incluido.");
        }

        return indice;
    }

    //pesquisar(vetNumeros, teclado);
    
    private int pesquisar(int vetor[],Scanner teclado, int indice){
        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();
        
        for(int i = 0; i < indice;i++){
            if (vetor[i] == numero){
                return i;
            }
        }
        return -1;
    }

    //alterar(vetNumeros,teclado,indiceAtual);
    private void alterar(int vetor[], Scanner teclado, int indice){
        int indiceAlteracao = pesquisar(vetor, teclado, indice);

        if (indiceAlteracao >= 0){
            System.out.print("Informe o novo número para vetor["+indiceAlteracao+"]:");
            vetor[indiceAlteracao] = teclado.nextInt();
        }else{//se não encontrou o valor no vetor
            System.out.println("número não encontrado");

        }

    }

    private int excluir(int vetor[], int indice, Scanner teclado){
        int indiceExclusao = pesquisar(vetor, teclado, indice);

        if (indiceExclusao >= 0){//número foi localizado
            for(int i = indiceExclusao; i < indice-1;i++){
                vetor[i] = vetor[i+1];
            }
            indice--;

            System.out.println("O valor foi excluido. Vetor["+indiceExclusao+"]");
        }else{
            System.out.println("Valor não excluído.");
        }
        return indice;
    }

    //imprimir(vetNumeros,indiceAtual);
    private void imprimir(int vetor[], int indice){
        for (int i = 0; i < indice;i++){
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe10();
    }
}