/* Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
(considere que a idade entre homens e mulheres sempre serão diferentes). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
e o produto das idades do homem mais novo com a mulher mais velha. */

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade primeiro homem: ");
        int h1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Idade segundo homem: ");
        int h2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Idade primeira mulher: ");
        int m1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Idade segunda mulher: ");
        int m2 = Integer.parseInt(teclado.nextLine());

        int homemMaisVelho = Math.max(h1, h2);
        int homemMaisNovo = Math.min(h1, h2);

        int mulherMaisVelha = Math.max(m1, m2);
        int mulherMaisNova = Math.min(m1, m2);

        int soma = homemMaisVelho + mulherMaisNova;

        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("A soma deu: " + soma);
        System.out.println("O produto deu: " + produto);

        teclado.close();
    }
}
