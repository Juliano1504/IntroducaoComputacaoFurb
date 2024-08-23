/* Construa um programa para ler um número inteiro (assuma até 3 dígitos)
 e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  

Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  */

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        
        int centena, dezena, unidade, numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        centena = numero / 100;

        dezena = (numero / 10) - (centena * 10);

        unidade = numero - (centena * 100) - (dezena * 10);
        
        System.out.print(centena + " centena(s) - " + dezena + " dezena(s) - " + unidade + " unidade(s)");

        teclado.close();
    }
}
