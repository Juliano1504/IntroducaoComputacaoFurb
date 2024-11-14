import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor (máximo 20): ");
        int N = scanner.nextInt();

        if (N > 20) {
            System.out.println("O tamanho do vetor não pode ser maior que 20.");
        }

        double[] vetor = new double[N];

        System.out.println("Digite os " + N + " valores reais: ");
        for (int i = 0; i < N; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        for (int i = 0; i < N; i++) {
            int contador = 0;

            boolean jaContado = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    jaContado = true;
                    break;
                }
            }
            if (jaContado) {
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }

            System.out.println("Valor: " + vetor[i] + " - Ocorrências: " + contador);
        }

        scanner.close();
    }
}