/* Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
 (cédulas) no qual o valor pode ser decomposto.
  As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
  A seguir mostre o valor lido e a relação de notas necessárias. */

import java.util.Scanner;

public class UniUri1018 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();
        int valorOriginal = valor;
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        
        nota100 = valor / 100;
        valor %= 100;

        nota50 = valor / 50;
        valor %= 50;

        nota20 = valor / 20;
        valor %= 20;

        nota10 = valor / 10;
        valor %= 10;

        nota5 = valor / 5;
        valor %= 5;

        nota2 = valor / 2;
        valor %= 2;

        nota1 = valor;

        System.out.println(valorOriginal);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
        teclado.close();
    }
}
