/* Dados dois valores inteiros, escreva um algoritmo
 que informe se eles são múltiplos ou não.
*/

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Se o número: ");
        int n1 = Integer.parseInt(teclado.nextLine());

        System.out.println("É múltiplo de: ");
        int n2 = Integer.parseInt(teclado.nextLine());

        if (n1 % n2 == 0) {
            System.out.println("É múltiplo");
        } else {
            System.out.println("Não é múltiplo");
        }
        teclado.close();
    }
}
