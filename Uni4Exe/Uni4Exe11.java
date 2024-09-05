/* Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o
outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes. */

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ano do primeiro irmão: ");
        int ano1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ano do segundo irmão: ");
        int ano2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ano do terceiro irmão: ");
        int ano3 = Integer.parseInt(teclado.nextLine());

        if (ano1 == ano2 && ano2 == ano3) {
            System.out.println("São trigêmeos");
        } else if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3) {
            System.out.println("São gêmeos");
        } else {
            System.out.println("São irmãos");
        }
        teclado.close();
    }
}
