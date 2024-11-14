import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menosDe10 = 0, entre10e20 = 0, maisDe20 = 0;
        double totalCompra = 0, totalVenda = 0, lucroTotal = 0;
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print("Preço de compra: ");
            double precoCompra = scanner.nextDouble();
            
            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();
            scanner.nextLine();  // Limpa o buffer
            
            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;
            totalCompra += precoCompra;
            totalVenda += precoVenda;
            lucroTotal += (precoVenda - precoCompra);
            
            if (lucroPercentual < 10) {
                menosDe10++;
            } else if (lucroPercentual <= 20) {
                entre10e20++;
            } else {
                maisDe20++;
            }
        }
        
        System.out.println("Lucro < 10%: " + menosDe10);
        System.out.println("10% <= Lucro <= 20%: " + entre10e20);
        System.out.println("Lucro > 20%: " + maisDe20);
        System.out.printf("Total de compra: %.2f%n", totalCompra);
        System.out.printf("Total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);
        
        scanner.close();
    }
}

