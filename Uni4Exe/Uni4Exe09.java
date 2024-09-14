/* Dados dois valores inteiros, escreva um algoritmo
 que informe se eles são múltiplos ou não.
*/

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int n1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Valor 2 ");
        int n2 = Integer.parseInt(teclado.nextLine());

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Um dos números é múltiplo do outro");
        } else {
            System.out.println("Nenhum dos números é múltiplo do outro");
        }
        teclado.close();
    }
}
