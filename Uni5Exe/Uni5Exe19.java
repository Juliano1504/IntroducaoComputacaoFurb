import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total_dia = 0;
        
        while (true) {
            System.out.print("Digite o valor da compra (ou 0 para sair): ");
            double valor_compra = scanner.nextDouble();
            if (valor_compra == 0) {
                break;
            }

            double desconto;
            if (valor_compra > 500) {
                desconto = valor_compra * 0.20;
            } else {
                desconto = valor_compra * 0.15;
            }
            
            double total_pagar = valor_compra - desconto;
            System.out.printf("Total a pagar: R$ %.2f%n", total_pagar);
            
            total_dia += total_pagar;
        }

        System.out.printf("Valor total recebido pela loja no dia: R$ %.2f%n", total_dia);

        scanner.close();
    }
}
