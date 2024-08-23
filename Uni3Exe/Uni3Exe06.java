/*  Um restaurante cobra R$ 25,00 por cada quilo de refeição.
 Escreva um programa que leia o peso do prato montado 
 pelo cliente (em quilos) e imprima o valor a pagar. 
 O peso do prato é de 750 gramas. */

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        
        double peso, valor;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o peso do prato: ");
        peso = teclado.nextDouble();

        valor = (peso * 25) / 1000;

        System.out.print("Valor total do prato: " + valor);
        teclado.close();
    }
}
