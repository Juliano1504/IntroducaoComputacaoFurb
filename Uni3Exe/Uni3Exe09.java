/* Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

Volume = pi * raio2 * altura */

import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        
        double altura, raio, volume;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a altura da lata de óleo? ");
        altura = teclado.nextDouble();

        System.out.print("Qual o raio dessa lata? ");
        raio = teclado.nextDouble();

        volume = 3.14 * (raio * raio) * altura;

        System.out.print("O volume da lata é igual a: " + volume);
        teclado.close();
    }
}
