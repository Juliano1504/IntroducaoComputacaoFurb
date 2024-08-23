/* Uma granja possui um controle automatizado de cada frango da sua produção.
 No pé direito do frango há um anel com um chip de identificação; 
 no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
 Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
 faça um programa para calcular o gasto total da granja para marcar todos os seus 
 frangos. */
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
    
    double total;
    int frangos;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o número de frangos: ");
    frangos = teclado.nextInt();

    total = frangos * 11;

    System.out.print("Valor total dos gastos da granja: " + total);
    teclado.close();

    }
}
