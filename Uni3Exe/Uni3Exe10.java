/* Descreva um programa que leia o comprimento dos catetos 
de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula:  hipotenusa2 = cateto1^2 + cateto2^2*/

import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        
        double cateto1, cateto2, hipotenusa1, hipotenusa2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro cateto: ");
        cateto1 = teclado.nextDouble();

        System.out.print("Informe o segundo cateto: ");
        cateto2 = teclado.nextDouble();

        hipotenusa1 = (cateto1 * cateto1) + (cateto2 * cateto2);

        hipotenusa2 = Math.sqrt(hipotenusa1); //Math.sqrt() calcula a raiz quadrada do valor atribuido

        System.out.print("Valor da hipotenusa = " + hipotenusa2);
        teclado.close();

    }
}
