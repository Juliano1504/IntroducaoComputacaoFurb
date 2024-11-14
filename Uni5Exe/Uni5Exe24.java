import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o limite diário de pesca (em quilogramas): ");
        double limiteDiario = scanner.nextDouble() * 1000;

        double pesoTotal = 0.0;
        String continuar;

        do {
            System.out.print("Informe o peso do peixe (em gramas): ");
            double pesoPeixe = scanner.nextDouble();
            
            pesoTotal += pesoPeixe;
            
            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário excedido! Peso total: " + pesoTotal + " gramas.");
                break;
            }
            
            System.out.printf("Peso total da pesca até agora: %.2f gramas%n", pesoTotal);
            
            scanner.nextLine();
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = scanner.nextLine();
            
        } while (continuar.equalsIgnoreCase("s"));
        
        scanner.close();
    }
}
