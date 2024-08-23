/* Neste problema, deve-se ler o código de uma peça 1, o número 
de peças 1, o valor unitário de cada peça 1, o código de uma peça 2,
 o número de peças 2 e o valor unitário de cada peça 2. Após, 
 calcule e mostre o valor a ser pago. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1010 {
    public static void main(String[] args) {

        DecimalFormat df_2 = new DecimalFormat("0.00");  
        Scanner teclado = new Scanner(System.in);

        double codigo1 = teclado.nextDouble();
        double numero1 = teclado.nextDouble(); 
        double valor1 = teclado.nextDouble();
        double codigo2 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double valor2 = teclado.nextDouble();
        double total;

        total = (numero1 * valor1) + (numero2 * valor2);

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(total));
        teclado.close();
    }
}
