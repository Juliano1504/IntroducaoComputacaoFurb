/* Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
Faça um algoritmo para ler as idades dos filhos e exibir quem
é o caçula da família; suponha que não haja empates. */

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a idade do Marquinhos? ");
        int idadeM = Integer.parseInt(teclado.nextLine());

        System.out.println("Qual a idade do Zezinho? ");
        int idadeZ = Integer.parseInt(teclado.nextLine());

        System.out.println("Qual a idade da Luluzinha? ");
        int idadeL = Integer.parseInt(teclado.nextLine());

        if (idadeM < idadeZ && idadeM < idadeL) {
            System.out.println("Marquinhos é o caçula");
        } else if (idadeZ < idadeM && idadeZ < idadeL) {
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é a caçula");
        }
        teclado.close();
    }
}
