/* Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente.
O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero). */

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Valor 2: ");
        int valor2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números.");
        int opcao = Integer.parseInt(teclado.nextLine());

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor1 == 0 || valor2 == 0) {
                    System.out.println("Não é possível dividir por 0");
                } else {
                    System.out.println(valor1 / valor2);
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();

    }
}
