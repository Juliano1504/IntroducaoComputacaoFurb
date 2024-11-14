import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = numerosVetor(scanner);
        verificarVetor(numeros, scanner);
        scanner.close();
    }

    public static double[] numerosVetor(Scanner scanner) {
        System.out.println("Qual o tamanho do vetor?");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];

        System.out.println("Digite " + tamanho + " valores reais: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        return vetor;
    }

    public static void verificarVetor(double[] vetor, Scanner scanner) {
        System.out.println("Insira um valor e veja se ele esta no vetor: ");
        double verificarNumero = scanner.nextDouble();

        boolean encontrado = false;
        for (double valor : vetor) {
            if (valor == verificarNumero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + verificarNumero + " esta no vetor");
        } else {
            System.out.println("O valor " + verificarNumero + " nao esta no vetor");
        }
    }

}
