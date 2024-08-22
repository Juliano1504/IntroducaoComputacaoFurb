/* Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
Considerando que alguém está pagando uma compra, faça um programa 
que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
Escreva também o número de cada tipo de nota a ser fornecido como troco.
Suponha que o sistema monetário não utilize centavos. */

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        
        int quantidadeNotas,valorTroco, valorCompra, pagamento, nota1, nota10, nota100;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor da compra (Sem considerar os centavos) = R$ ");
        valorCompra = teclado.nextInt();

        System.out.print("Valor dado ao caixa para pagamento = R$ ");
        pagamento = teclado.nextInt();

        valorTroco =  pagamento - valorCompra;

        nota100 = valorTroco / 100;
        valorTroco %= 100;

        nota10 = valorTroco / 10;
        valorTroco %= 10;

        nota1 = valorTroco;

        quantidadeNotas = nota100 + nota10 + nota1;

        System.out.println("Mínimo de notas para troco: " + quantidadeNotas);
        System.out.println("Notas de 100 reais: " + nota100);
        System.out.println("Notas de 10 reais: " + nota10);
        System.out.println("Notas de 1 real: " + nota1);

        teclado.close();
    }
}
