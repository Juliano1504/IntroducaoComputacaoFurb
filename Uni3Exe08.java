/* Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
 Para isto ela entregou um valor em dólares para o atendente. 
 Considerando que o atendente tem a cotação do dólar, descreva um 
 programa para calcular quantos reais o atendente deve devolver para a pessoa. */

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        
        double dolares, total;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos dólares você tem? $");
        dolares = teclado.nextDouble();

        total = dolares * 5.49;

        System.out.print("Total convertido de dólares em reais: R$" + total);
        teclado.close();
    }
}
