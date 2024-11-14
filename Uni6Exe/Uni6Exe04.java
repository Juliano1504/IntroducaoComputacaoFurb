import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[][] vetores = lerVetores();
        int[] soma = somaVetores(vetores[0], vetores[1]);
        exibirVetor(soma);
    }

    public static int[][] lerVetores() {
        Scanner scanner = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        System.out.println("Vetor 1");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira o numero " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Vetor 2");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira o numero " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }
        scanner.close();
        return new int[][] { vetor1, vetor2 };
    }

    public static int[] somaVetores(int[] vetor1, int[] vetor2) {
        int[] soma = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }
        return soma;
    }

    public static void exibirVetor(int[] soma) {
        System.out.println("Soma do vetor 1 e vetor 2");
        for (int numero : soma) {
            System.out.print(numero + " ");
        }
    }
}