public class Uni5Exe11 {
    public static void main(String[] args) {
        int qtdBiscoitosQuebrados = 0;
        for (int hora = 1; hora <= 16; hora++){
            switch (hora) {
                case 1:
                    qtdBiscoitosQuebrados++;
                    break;
                case 2:
                    qtdBiscoitosQuebrados += 3;
                    break;
                
                default:
                    qtdBiscoitosQuebrados *=3;
                    break;
            }
        }

        System.out.println("Quantidade de biscoitos "+
                           " quebrados no dia: "+qtdBiscoitosQuebrados);
    }
}
