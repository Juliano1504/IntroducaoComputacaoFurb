import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor máximo de pedágio: ");
        double valorMaximoPedagio = scanner.nextDouble();
        
        int trechosAcimaLimite = 0;
        int totalTrechos = 0;
        int trechosLongosAceitos = 0;
        double custoPedagio;
        int distancia;

        while (true) {
            System.out.print("Pedágio: ");
            custoPedagio = scanner.nextDouble();
            if (custoPedagio < 0) {
                break;
            }
            System.out.print("Distância: ");
            distancia = scanner.nextInt();

            if (custoPedagio > valorMaximoPedagio) {
                trechosAcimaLimite++;
            }
            totalTrechos++;
            if (distancia > 150 && custoPedagio <= valorMaximoPedagio) {
                trechosLongosAceitos++;
            }
        }

        System.out.println(trechosAcimaLimite + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosLongosAceitos + " (trechos acima de 150km com valor aceito por ele)");

        scanner.close();
    }
}
