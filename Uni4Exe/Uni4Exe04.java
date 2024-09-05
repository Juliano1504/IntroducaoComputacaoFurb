/* Dado um número de ponto flutuante maior do que 0,
informe se foram digitadas ou não casas decimais no número. */

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = Double.parseDouble(teclado.nextLine());

        if (n1 % 1 != 0) {
            System.out.println("O número possui casas decimais");
        } else {
            System.out.println("O número não possui casa decimais");
        }
        teclado.close();
    }
}
