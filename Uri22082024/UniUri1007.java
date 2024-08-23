/* Leia quatro valores inteiros A, B, C e D. A seguir, calcule
 e mostre a diferença do produto de A e B pelo produto de C e D
  segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class UniUri1007 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int diferenca;

        diferenca = (A*B) - (C*D);

        System.out.println("DIFERENCA = " + diferenca);
        teclado.close();
    }
}
