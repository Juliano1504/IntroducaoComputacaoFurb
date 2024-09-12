/* Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio */

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Valor 2: ");
        int valor2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Valor 3: ");
        int valor3 = Integer.parseInt(teclado.nextLine());

        System.out.println("Opção: ");
        int opcao = Integer.parseInt(teclado.nextLine());

        int menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.println(meio + " " + maior + " " + menor);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();
    }
}
