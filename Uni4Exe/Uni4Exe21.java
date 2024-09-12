/* O índice de massa corporal (IMC) é uma medida internacional usada
 para calcular se uma pessoa está no peso ideal. O IMC é determinado 
 pela divisão da massa do indivíduo pelo quadrado de sua altura, 
 onde a massa está em quilogramas e a altura está em metros*/

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o seu peso? ");
        double peso = Double.parseDouble(teclado.nextLine());

        System.out.println("Qual a sua altura? ");
        double altura = Double.parseDouble(teclado.nextLine());

        double imc = peso / (altura*altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 24.9) {
            classificacao = "Saudável";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade Grau II(Severa)";
        } else {
            classificacao = "Obesidade Grau III(Mórbida)";
        }

        System.out.println("Altura = " + altura + ". Peso = " + peso + ". " + classificacao);
        teclado.close();
    }
}
