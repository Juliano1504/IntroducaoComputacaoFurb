/* Leia 3 valores inteiros e ordene-os em ordem crescente. \
No final, mostre os valores em ordem crescente,
uma linha em branco e em seguida, os valores na sequência como foram lidos. */

import java.util.Scanner;

public class UniUri1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();

        int menor = 0, meio = 0, maior = 0;


        if (n1 < n2 && n1 < n3) {
            menor = n1;
            if (n2 > n3){
                meio = n3;
                maior = n2;
            } else {
                maior = n3;
                meio = n2;
            }
        }

        if (n2 < n1 && n2 < n3) {
            menor = n2;
            if (n1 > n3){
                meio = n3;
                maior = n1;
            } else {
                meio = n1;
                maior = n3;
            }
        }

        if (n3 < n1 && n3 < n2){
            menor = n3;
            if (n1 > n2) {
                meio = n2;
                maior = n1;
            } else {
                meio = n1;
                maior = n2;
            }
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        teclado.close();
    }
}
