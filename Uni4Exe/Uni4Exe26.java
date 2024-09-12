/* Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r */

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("'T': calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q': calcular a área de um quadrado de lado l");
        System.out.println("'R': calcular a área de um retângulo de base b e altura h");
        System.out.println("'C': calcular a área de um círculo de raio r");
        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo");

                System.out.println("Base: ");
                double base = teclado.nextDouble();

                System.out.println("Altura: ");
                double altura = teclado.nextDouble();

                System.out.println("Área do triângulo = " + base * altura / 2);
                break;
            case 'Q':
                System.out.println("Digite o lado");
                double lado = teclado.nextDouble();

                System.out.println("Área do quadrado = " + lado * lado);
                break;
            case 'R':
                System.out.println("Digite a base e altura do retângulo");

                System.out.println("Base: ");
                double baseR = teclado.nextDouble();

                System.out.println("Altura: ");
                double alturaR = teclado.nextDouble();

                System.out.println("Área do retângulo = " + baseR * alturaR);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double raio = teclado.nextDouble();

                System.out.println("Área do círculo = " + Math.PI * Math.pow(raio, 2));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
        teclado.close();
    }
}
