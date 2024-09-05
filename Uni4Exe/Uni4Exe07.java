/* O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas,
ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta,
em gramas, determine o custo do selo. */

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pesoExcedido;
        double qtAdicional;
        double valorFinal;

        System.out.println("Informe o peso da carta: ");
        int peso = Integer.parseInt(teclado.nextLine());

        if (peso <= 50) {
            valorFinal = 0.45;
        } else {
            pesoExcedido = peso - 50;
            qtAdicional = (pesoExcedido / 20) + 1;
            valorFinal = 0.45 + 0.45 * qtAdicional;
        }
        System.out.println("Valor a pagar = R$ " + valorFinal);
    }
}
