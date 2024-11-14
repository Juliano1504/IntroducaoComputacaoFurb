import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        int numeros[] = lerValores();
        exibirValores(numeros);
    }

    public static int[] lerValores() {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira os numero " + i);
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        return numeros;
    }

    public static void exibirValores(int[] numeros) {
        for (int i = 10 - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}