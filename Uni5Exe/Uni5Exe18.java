import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total_canal_4 = 0, total_canal_5 = 0, total_canal_9 = 0, total_canal_12 = 0;
        int total_pessoas = 0;
        
        while (true) {
            System.out.print("Digite o número do canal (ou 0 para sair): ");
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int num_pessoas = scanner.nextInt();
            
            if (canal == 4) {
                total_canal_4 += num_pessoas;
            } else if (canal == 5) {
                total_canal_5 += num_pessoas;
            } else if (canal == 9) {
                total_canal_9 += num_pessoas;
            } else if (canal == 12) {
                total_canal_12 += num_pessoas;
            }

            total_pessoas += num_pessoas;
        }

        if (total_pessoas > 0) {
            double perc_canal_4 = (total_canal_4 / (double) total_pessoas) * 100;
            double perc_canal_5 = (total_canal_5 / (double) total_pessoas) * 100;
            double perc_canal_9 = (total_canal_9 / (double) total_pessoas) * 100;
            double perc_canal_12 = (total_canal_12 / (double) total_pessoas) * 100;

            System.out.printf("Percentual de audiência do Canal 4: %.2f%%%n", perc_canal_4);
            System.out.printf("Percentual de audiência do Canal 5: %.2f%%%n", perc_canal_5);
            System.out.printf("Percentual de audiência do Canal 9: %.2f%%%n", perc_canal_9);
            System.out.printf("Percentual de audiência do Canal 12: %.2f%%%n", perc_canal_12);
        } else {
            System.out.println("Nenhuma pessoa foi registrada assistindo TV.");
        }

        scanner.close();
    }
}
