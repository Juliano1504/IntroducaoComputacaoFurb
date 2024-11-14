import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa inicial (em Kg): ");
        double massa_inicial = scanner.nextDouble();
        
        double massa = massa_inicial;
        int tempo = 0;
        double limite = 0.0005;

        while (massa >= limite) {
            massa /= 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.5f Kg%n", massa_inicial);
        System.out.printf("Massa final: %.5f Kg%n", massa);
        System.out.printf("Tempo necessário: %d segundos%n", tempo);
        
        scanner.close();
    }
}
