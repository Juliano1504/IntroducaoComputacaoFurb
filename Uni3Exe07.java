/*  Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
 Se um comerciante compra uma determinada quantidade de cada formato, 
 faça um programa para calcular quantos litros de refrigerante ele comprou. */

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        
        int garrafaP, garrafaM, garrafaG, total;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas garrafas de 350ml você comprou? ");
        garrafaP = teclado.nextInt();
        System.out.print("Quantas garrafas de 600ml você comprou? ");
        garrafaM = teclado.nextInt();
        System.out.print("Quantas garrafas de 2L você comprou? ");
        garrafaG = teclado.nextInt();

        total = (garrafaP * 350) + (garrafaM * 600) + (garrafaG * 2000);

        System.out.print("Quantidade de litros que você comprou: " + total);
        teclado.close();
    }
}
