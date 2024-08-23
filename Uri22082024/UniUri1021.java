/* Leia um valor de ponto flutuante com duas casas decimais. Este valor
representa um valor monetário. A seguir, calcule o menor número de notas 
e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. 
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias. */

import java.util.Scanner;

public class UniUri1021 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();
        int nota100, nota50, nota20, nota10, nota5, nota2;
        int moeda1, moeda50, moeda25, moeda10, moeda05, moeda01;
        int centavos = (int) Math.round(valor * 100);

        nota100 = centavos / 10000;
        centavos %= 10000;

        nota50 = centavos / 5000;
        centavos %= 5000;

        nota20 = centavos / 2000;
        centavos %= 2000;

        nota10 = centavos / 1000;
        centavos %= 1000;

        nota5 = centavos / 500;
        centavos %= 500;

        nota2 = centavos / 200;
        centavos %= 200;

        moeda1 = centavos / 100;
        centavos %= 100;

        moeda50 = centavos / 50;
        centavos %= 50;

        moeda25 = centavos / 25;
        centavos %= 25;

        moeda10 = centavos / 10;
        centavos %= 10;

        moeda05 = centavos / 5;
        centavos %= 5;

        moeda01 = centavos;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
        teclado.close();
    }
}