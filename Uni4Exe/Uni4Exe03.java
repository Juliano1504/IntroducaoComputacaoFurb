/* Dados dois números inteiros descreva um
algoritmo para informar o maior valor entre eles. */

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite o segundo número: ");
        double n2 = Double.parseDouble(teclado.nextLine());

        if (n1 > n2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
        teclado.close();
    }
}
