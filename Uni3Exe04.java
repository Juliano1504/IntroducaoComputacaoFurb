/* Faça um programa para ler três notas de um aluno 
em uma disciplina e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2). */

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, somaNota, mediaPonderada;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.print("Segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.print("Terceira nota: ");
        nota3 = teclado.nextDouble();

        somaNota = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
        mediaPonderada = somaNota / 10;

        System.out.print("Média ponderada total: " + mediaPonderada);
        teclado.close();
    }
}
