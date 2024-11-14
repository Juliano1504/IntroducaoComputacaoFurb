import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontosD = 0;
        int pontosE = 0;
        String ponto;

        while (true) {
            System.out.print("Digite o ponto (D para jogador direito, E para jogador esquerdo): ");
            ponto = scanner.nextLine();
            
            if (ponto.equalsIgnoreCase("D")) {
                pontosD++;
            } else if (ponto.equalsIgnoreCase("E")) {
                pontosE++;
            }

            if ((pontosD >= 21 && (pontosD - pontosE) >= 2) || (pontosE > 21 && (pontosE - pontosD) >= 2)) {
                System.out.println("Vencedor: Jogador " + (pontosD > pontosE ? "Direito" : "Esquerdo"));
                break;
            }
        }

        scanner.close();
    }
}
