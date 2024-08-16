/* Uma loja de calçados está concedendo 12% de desconto nos produtos. 
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos 
e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado 
pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        
        double preco, desconto, total;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o preço do sapato: ");
        preco = teclado.nextDouble();
        
        desconto = preco * 0.12;

        total = preco - desconto;

        System.out.println("O valor total do desconto ficou em: R$" + desconto);
        System.out.println("O preço final do sapato ficou em: R$" + total);
        teclado.close();

    }
}
