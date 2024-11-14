import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;
        
        do {
            System.out.print("Digite o nome do vendedor: ");
            String nomeVendedor = scanner.nextLine();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int n = scanner.nextInt();
            
            double totalVendas = 0.0;
            double salario;
            
            for (int i = 0; i < n; i++) {
                System.out.print("Digite o preço unitário do produto " + (i + 1) + ": ");
                double precoUnitario = scanner.nextDouble();
                
                System.out.print("Digite a quantidade vendida do produto " + (i + 1) + ": ");
                int quantidadeVendida = scanner.nextInt();
                
                totalVendas += precoUnitario * quantidadeVendida;
            }
            
            salario = totalVendas * 0.30;
            System.out.printf("Relatório do Vendedor: %s%n", nomeVendedor);
            System.out.printf("Total de Vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salário: R$ %.2f%n", salario);
            
            scanner.nextLine(); // Limpar o buffer do scanner
            
            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continuar = scanner.nextLine();
            
        } while (continuar.equalsIgnoreCase("s"));
        
        scanner.close();
    }
}
