/* Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50.
 Faça um programa para ler o comprimento e altura de uma parede (em metros), 
 e depois escrever o valor gasto com a compra de azulejos.
  Considere que um metro quadrado é formado por 9 azulejos.
 */

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        
        double valorTotal, altura, comprimento, area;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura da parede em metros = ");
        altura = teclado.nextDouble();

        System.out.print("Comprimento da parede em metros = ");
        comprimento = teclado.nextDouble();

        area = altura * comprimento;

        valorTotal = area * 112.5;

        System.out.print("Valor total gasto = R$" + valorTotal);

        teclado.close();
    }
}
