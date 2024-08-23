/* Escreva um programa que leia o número de um funcionário,
 seu número de horas trabalhadas, o valor que recebe por hora
  e calcula o salário desse funcionário. A seguir, mostre o número 
  e o salário do funcionário, com duas casas decimais. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1008 {
    public static void main(String[] args) {

        DecimalFormat df_2 = new DecimalFormat("0.00");

        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        int horas = teclado.nextInt();
        double salarioHora = teclado.nextDouble();
        double salario;

        salario = salarioHora * horas;

        System.out.println("NUMBER = " + (numero));
        System.out.println("SALARY = U$ " + df_2.format(salario));
        teclado.close();
    }
}
