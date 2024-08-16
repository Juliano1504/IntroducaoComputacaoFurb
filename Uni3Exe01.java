// Uma imobiliária vende apenas terrenos retangulares.
// Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {

        double largura, comprimento, area;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a largura do terreno: ");
        largura = teclado.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        comprimento = teclado.nextDouble();

        area = largura * comprimento;

        System.out.print("Área total: " + area);
        teclado.close();
    }
}
