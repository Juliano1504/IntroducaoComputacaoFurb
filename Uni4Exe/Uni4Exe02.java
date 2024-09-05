/* Dado um valor inteiro maior do que 0
informe se o valor é par ou ímpar. */

import java.util.Scanner;

class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = Double.parseDouble(teclado.nextLine());

        if (numero % 2 == 0) {
            System.out.println("O nùmero é par");
        } else {
            System.out.println("O número é ímpar");
        }
        teclado.close();
    }
}
