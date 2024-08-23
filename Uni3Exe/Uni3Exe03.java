/* Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina 
e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque. */

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        
        double precoLitro, pagamento, litros;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Preço do litro: ");
        precoLitro = teclado.nextDouble();
        System.out.print("Valor pago: ");
        pagamento = teclado.nextDouble();

        litros = pagamento / precoLitro;

        System.out.print("Com isso, você conseguiu colocar " + litros + " litros");
        teclado.close();
    }
}
