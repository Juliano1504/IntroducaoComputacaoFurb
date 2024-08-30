/* A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
o valor por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas). */

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
    int horasMes;
    double valorHora, salarioExtra, salarioTotal;

    System.out.println("Quantas horas você trabalhou? ");
    horasMes = teclado.nextInt();

    System.out.println("Quanto você ganha por hora? ");
    valorHora = teclado.nextDouble();

    salarioTotal = horasMes * valorHora;
    
    if (horasMes > 160) {
        salarioExtra = (horasMes - 160) * (valorHora / 2);
        salarioTotal = salarioTotal + salarioExtra;
    }

    System.out.println("Salário total: R$ " + salarioTotal);
    teclado.close();

    }
}
