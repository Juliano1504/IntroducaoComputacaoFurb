import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;
        int voto;
        
        do {
            System.out.print("Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para em branco, 0 para sair): ");
            voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosEmBranco++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        } while (voto != 0);
        
        System.out.println("\nTotal de votos para cada candidato:");
        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i]);
        }
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
        
        if (totalVotos > 0) {
            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualBranco = (double) votosEmBranco / totalVotos * 100;
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBranco);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }
        
        scanner.close();
    }
}
