import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de numeros a serem exibidos: ");
        int n = scanner.nextInt();

        double min = Double.NEGATIVE_INFINITY;

        double media = 0;
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero real: ");
            double numeroReal = scanner.nextDouble();

            if (numeroReal < 0) {
                min = numeroReal;
            }
            if (numeroReal > 0) {
                soma += numeroReal;
                contador++;
                media = soma / contador;
            }

        }
        System.out.println("O menor numero negativo é: " + min);
        System.out.println("A media dos numeros positivos é igual a: " + media);

        scanner.close();
    }

}
