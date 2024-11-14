import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero positivo: ");
        int n = scanner.nextInt();

        int numero = 1;
        
        for (int i = 1; i <= n; i++) {
          for (int j = 0; j <= i; j++) {
            System.out.print(numero + " ");
            numero++;
          }
          System.out.println();
        }
        scanner.close();
    }
}
