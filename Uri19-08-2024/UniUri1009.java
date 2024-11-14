/* Faça um programa que leia o nome de um vendedor, o seu salário fixo
 e o total de vendas efetuadas por ele no mês (em dinheiro). 
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
  efetuadas, informar o total a receber no final do mês, com duas casas 
decimais. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1009 {
    public static void main(String[] args) {

        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        double salario = teclado.nextDouble();
        double vendas = teclado.nextDouble();
        double total;

        total = salario + (vendas * 0.15);

        System.out.println("TOTAL = R$ " + df_2.format(total));
        teclado.close();
    }
}
