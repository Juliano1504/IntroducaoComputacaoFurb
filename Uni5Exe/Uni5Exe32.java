import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int p = scanner.nextInt();
        
        System.out.print("Digite o número de dias no mês: ");
        int n = scanner.nextInt();
        
        System.out.println("\nD\tS\tT\tQ\tQ\tS\tS");
        
        int dia = 1;
        int diaDaSemana = p;

        for (int i = 1; i < diaDaSemana; i++) {
            System.out.print("\t");
        }

        while (dia <= n) {
            System.out.print(dia + "\t");
            
            if (diaDaSemana % 7 == 0) {
                System.out.println();
            }
            
            dia++;
            diaDaSemana++;
            
            if (diaDaSemana > 7) {
                diaDaSemana = 1;
            }
        }
        
        scanner.close();
    }
}
