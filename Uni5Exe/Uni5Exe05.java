import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor (maior que 2): ");
        int n = scanner.nextInt();

        int multiplo = 8;

        if (n <= 2) {
            System.out.println("O valor deve ser maior que 2");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println(multiplo);
                } else {
                    System.out.println(multiplo + 2);
                    multiplo *= 2;
                }
            }
        }
        scanner.close();
    }
}
