import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o odômetro inicial: ");
        int odometroInicial = scanner.nextInt();
        
        System.out.print("Digite o odômetro final: ");
        int odometroFinal = scanner.nextInt();
        
        System.out.print("Digite o número total de reabastecimentos: ");
        int numReabastecimentos = scanner.nextInt();
        
        double quilometragemTotal = odometroFinal - odometroInicial;
        double totalCombustivel = 0;
        double[] quilometragemPorLitro = new double[numReabastecimentos];

        for (int i = 0; i < numReabastecimentos; i++) {
            System.out.print("Digite o odômetro na parada " + (i + 1) + ": ");
            int odometroParada = scanner.nextInt();
            
            System.out.print("Digite a quantidade de combustível comprada (litros) na parada " + (i + 1) + ": ");
            double combustivelComprado = scanner.nextDouble();

            double quilometragemDaParada = odometroParada - ((i == 0) ? odometroInicial : odometroParada);
            quilometragemPorLitro[i] = quilometragemDaParada / combustivelComprado;
            totalCombustivel += combustivelComprado;

            System.out.printf("Quilometragem obtida por litro na parada %d: %.2f km/l%n", (i + 1), quilometragemPorLitro[i]);
        }

        double quilometragemMedia = quilometragemTotal / totalCombustivel;
        System.out.printf("Quilometragem média obtida por litro em toda a viagem: %.2f km/l%n", quilometragemMedia);

        scanner.close();
    }
}
