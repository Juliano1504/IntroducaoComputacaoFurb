/* Escreva um algoritmo que obtém do usuário 3 valores inteiros representando
 as três cartas deste usuário em uma mão de jogo de truco 
(1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei).
O algoritmo deve imprimir na tela a palavra 
"TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3),
"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) 
ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
Dica: criar variáveis intermediárias para contar a quantidade de "boas". */

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeira carta: ");
        int c1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Segunda carta: ");
        int c2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Terceira carta: ");
        int c3 = Integer.parseInt(teclado.nextLine());

        int CartasBoas = 0;

        if (c1 == 1 || c1 == 2 || c1 == 3) {
            CartasBoas++;
        }
        if (c2 == 1 || c2 == 2 || c2 == 3) {
            CartasBoas++;
        }
        if (c3 == 1 || c3 == 2 || c3 == 3) {
            CartasBoas++;
        }

        if (CartasBoas == 1) {
            System.out.println("TRUCO!");
        } else if (CartasBoas == 2) {
            System.out.println("SEIS!");
        } else if (CartasBoas == 3) {
            System.out.println("NOVE!");
        } else {
            System.out.println("Mais sorte na próxima");
        }
        teclado.close();
    }
}
