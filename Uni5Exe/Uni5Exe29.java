import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] cedulas = {20, 10, 5, 2, 1};
        System.out.print("Digite o valor que deseja retirar: R$ ");
        int valor = scanner.nextInt();
        
        System.out.println("Cédulas fornecidas:");
        
        int i = 0;
        while (valor > 0 && i < cedulas.length) {
            int cedula = cedulas[i];
            if (valor >= cedula) {
                int quantidade = valor / cedula;
                valor %= cedula;
                System.out.println(quantidade + " cédula(s) de R$ " + cedula);
            }
            i++;
        }
        
        scanner.close();
    }
}
