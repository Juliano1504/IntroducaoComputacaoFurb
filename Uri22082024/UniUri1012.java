/* Escreva um programa que leia três valores com ponto flutuante 
de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1012 {
    public static void main(String[] args) {
        
        DecimalFormat df_3 = new DecimalFormat("0.000");
        Scanner teclado = new Scanner(System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double areaT;
        double areaC;
        double areaTrapezio;
        double areaQ;
        double areaR;

        areaT = (A * C) / 2;
        areaC = 3.14159 * (C*C);
        areaTrapezio = ((A+B) * C) / 2;
        areaQ = B*B;
        areaR = A*B;


        System.out.println("TRIANGULO: " + df_3.format(areaT));
        System.out.println("CIRCULO: " + df_3.format(areaC));
        System.out.println("TRAPEZIO: " + df_3.format(areaTrapezio));
        System.out.println("QUADRADO: " + df_3.format(areaQ));
        System.out.println("RETANGULO: " + df_3.format(areaR));
        teclado.close();
    }
}
