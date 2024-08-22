/* Descreva um programa que dado uma temperatura 
em °C informe o seu valor em °F. Fórmula:
°F = (9/5) °C + 32 */

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        
        double temperatura, conversao;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus celsius: ");
        temperatura = teclado.nextDouble();

        conversao = 1.8 * temperatura + 32;

        System.out.print("Temperatura convertida em Farenheit: " + conversao);
        teclado.close();
    }
}
