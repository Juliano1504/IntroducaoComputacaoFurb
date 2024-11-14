import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contasEncerradas = 0;
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de diárias: ");
                    int diarias = scanner.nextInt();
                    
                    double valorDiaria = 50.0;
                    double taxaServico;
                    
                    if (diarias < 15) {
                        taxaServico = 7.50;
                    } else if (diarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }
                    
                    double total = (valorDiaria * diarias) + (taxaServico * diarias);
                    System.out.printf("Nome: %s - Total a ser pago: R$ %.2f\n", nome, total);
                    contasEncerradas++;
                    break;
                    
                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
