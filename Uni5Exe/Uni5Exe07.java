import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de números reais a serem exibidos: ");
        int n = scanner.nextInt();

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número real: ");
            double numReal = scanner.nextDouble();

            if (numReal > max) {
                max = numReal;
            }
            if (numReal < min) {
                min = numReal;
            }
        }

        System.out.println("O maior número é: " + max);
        System.out.println("O menor número é: " + min);

        scanner.close();
    }
}
