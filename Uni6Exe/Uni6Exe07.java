import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        int[] numeros = numerosVetor();
        ordenarVetor(numeros);
        mostrarVetor(numeros);
    }

    public static int[] numerosVetor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor (maximo 20)");
        int tamanho = scanner.nextInt();
        if (tamanho > 20) {
            tamanho = 20;
        }

        int[] vetor = new int[tamanho];
        int i = 0;

        while (i < tamanho) {
            System.out.println("Digite um numero inteiro");
            int numero = scanner.nextInt();
            
            if (!existeNoVetor(vetor, numero)) {
                vetor[i] = numero;
                i++;
            } else {
                System.out.println("O numero " + numero + " ja existe no vetor. Digite outro numero");
            }
        }
        scanner.close();
        return vetor;
    }

    public static boolean existeNoVetor(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length -1 -i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
            }
        }
    }

    public static void mostrarVetor(int[] vetor) {
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println();
    }
}
