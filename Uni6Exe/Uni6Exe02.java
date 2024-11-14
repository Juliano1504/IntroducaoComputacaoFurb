import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] valores = lerValores();
        double media = calculaMedia(valores);
        exibirValores(valores, media);
    }

    public static double[] lerValores() {
        Scanner scanner = new Scanner(System.in);
        double valores[] = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Insira o valor " + i);
            valores[i] = scanner.nextDouble();
        }
        scanner.close();
        return valores;
    }

    public static double calculaMedia(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public static void exibirValores(double[] valores, double media) {
        System.out.println("Valores maiores que a media (" + media + "):");
        for (double valor : valores) {
            if (valor > media) {
                System.out.println(valor);
            }
        }
    }
}