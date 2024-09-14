/* Uma loja que trabalha com crediário funciona da seguinte maneira:
se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto
e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias
após o vencimento o cliente perde o desconto,e se o pagamento atrasa mais de cinco dias,
é cobrada uma multa de 2% por cada dia de atraso.
 Faça um algoritmo que leia o dia do vencimento,
 o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente,
 exibindo as devidas mensagens.
 Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte. */

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dia do vencimento: ");
        int v1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Dia do pagamento: ");
        int p1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Valor da prestação: ");
        double vp1 = Double.parseDouble(teclado.nextLine());

        if (p1 <= v1 && p1 >= 1) {
            vp1 = vp1 - (vp1 * 0.10);
            System.out.println("O valor da prestação ficou em: R$ " + vp1);
        } else if (p1 > v1 && p1 <= v1 + 5) {
            System.out.println("O valor da prestação ficou em: R$ " + vp1);
        } else if (p1 > v1 + 5 && p1 <= 30){
            vp1 = vp1 + (p1 - v1) * (vp1 * 0.02) ;
            System.out.println("O valor da prestação ficou em: R$ " + vp1);
        }
        teclado.close();
    }
}
