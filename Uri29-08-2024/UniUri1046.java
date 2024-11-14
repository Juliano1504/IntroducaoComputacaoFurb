/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
 sabendo que o mesmo pode começar em um dia e terminar em outro,
 tendo uma duração mínima de 1 hora e máxima de 24 horas. */

import java.util.Scanner;

public class UniUri1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();

        int duracao;

        if (n1 < n2){
            duracao = n2 - n1;
        } else {
            duracao = (24 - n1) + n2;
        }
        if (n1 == n2){
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        teclado.close();
    }
}
