import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        //Calcule o número mínimo de nodes necessários
        double numeroMinimoNodes = Math.ceil((double) numeroTotalPods / podsPorNode);

        //Calcule o número mínimo de servidores necessários
        double numeroMinimoServidores =  Math.ceil((double) numeroTotalPods / podsPorServidor);


                //Exiba o resultado com as recomendações de quantidades de servidores e nodes.
                if(numeroMinimoNodes <= 1){
                    System.out.println("1.Recomendamos usar um unico node");
                }
                else{
                    System.out.println("1.Numero minimo de nodes:" + (int) numeroMinimoNodes);
                }

                if (numeroMinimoServidores <=1 ){
                    System.out.println("2.Recomendamos usar um unico servidor");
                }
                else{
                    System.out.println("2.Numero minimo de servidores:" + (int) numeroMinimoServidores);
                }

                // Fechando o Scanner
                scanner.close();
    }
}