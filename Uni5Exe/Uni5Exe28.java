import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votos = new int[4];
        int totalVotos = 0;
        String[] conjuntos = {"Nenhum de Nós", "CPM22", "Skank", "Jota Quest"};
        
        while (true) {
            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            String resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
            
            System.out.print("Digite o código do conjunto (1 a 4): ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            
            if (codigo >= 1 && codigo <= 4) {
                votos[codigo - 1]++;
                totalVotos++;
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }
        }

        int maxVotos = 0;
        int indiceVencedor = 0;
        
        System.out.println("\nResultados da votação:");
        for (int i = 0; i < conjuntos.length; i++) {
            System.out.printf("%s: %d votos (%.2f%%)%n", conjuntos[i], votos[i], 
                              (totalVotos > 0 ? (votos[i] * 100.0 / totalVotos) : 0));
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceVencedor = i;
            }
        }
        
        System.out.printf("Grupo vencedor: %s com %d votos.%n", conjuntos[indiceVencedor], maxVotos);
        
        scanner.close();
    }
}
