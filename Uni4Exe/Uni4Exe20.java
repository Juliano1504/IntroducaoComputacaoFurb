/* Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
 descreva um algoritmo que calcule a média de aproveitamento
 e o conceito do aluno, usando a fórmula: */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("#.00");

        System.out.println("Nota prova 1: ");
        double nota1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Nota prova 2: ");
        double nota2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Nota prova 3: ");
        double nota3 = Double.parseDouble(teclado.nextLine());

        System.out.println("Média final exercícios: ");
        double mediaEx = Double.parseDouble(teclado.nextLine());

        double media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaEx) / 7;

        char conceito;

        String status;

        if (media >= 9){
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6) {
            conceito = 'C';
        } else if (media >= 4 ) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        System.out.println("A média de aproveitamento foi: " + df_2.format(media) + "." + " Conceito: " + conceito + ". " + status);
        teclado.close();
    }
}
