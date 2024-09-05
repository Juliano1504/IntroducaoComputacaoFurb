/* Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo,
 descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo.
Em caso afirmativo, verifique e informe se é "triângulo equilátero",
"triângulo isósceles" ou "triângulo escaleno".
Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes */

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Lado 1: ");
        double l1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Lado 2: ");
        double l2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Lado 3: ");
        double l3 = Double.parseDouble(teclado.nextLine());

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
        teclado.close();
    }
}
