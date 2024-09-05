/* Dada uma pergunta, “a cor é azul?”, faça um programa
 que leia uma variável lógica com a resposta e responda “Sim”,
 caso a resposta seja true, ou “Não”, caso seja falso. */

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("A cor é azul? (true/false) ");
        boolean resposta = teclado.nextBoolean();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
        teclado.close();
    }
}
