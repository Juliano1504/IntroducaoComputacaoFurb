import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] numeros = lerNumeros();
        aumentaNumero(numeros);
        exibirNumeros(numeros);
    }

    public static double[] lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[12];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        scanner.close();
        return numeros;
    }

    public static double[] aumentaNumero(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                numeros[i] = numeros[i] + (numeros[i] * 0.02);
            } else {
                numeros[i] = numeros[i] + (numeros[i] * 0.05);
            }
        }
        return numeros;
    }

    public static void exibirNumeros(double[] numeros) {
        System.out.println("Valores aumentados");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
