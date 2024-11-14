import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma_total = 0;
        int quant_total = 0;
        double soma_mulheres = 0;
        int quant_mulheres = 0;
        
        while (true) {
            System.out.print("Digite a altura (ou 0 para sair): ");
            double altura = scanner.nextDouble();
            if (altura == 0) {
                break;
            }

            System.out.print("Digite o gênero (M/F/O): ");
            char genero = scanner.next().charAt(0);
            
            soma_total += altura;
            quant_total++;
            
            if (genero == 'F' || genero == 'f') {
                soma_mulheres += altura;
                quant_mulheres++;
            }
        }
        
        if (quant_total > 0) {
            double media_total = soma_total / quant_total;
            System.out.printf("Média de altura do grupo: %.2f%n", media_total);
        } else {
            System.out.println("Nenhuma pessoa foi informada.");
        }
        
        if (quant_mulheres > 0) {
            double media_mulheres = soma_mulheres / quant_mulheres;
            System.out.printf("Média de altura das mulheres: %.2f%n", media_mulheres);
        } else {
            System.out.println("Nenhuma mulher foi informada.");
        }

        scanner.close();
    }
}
