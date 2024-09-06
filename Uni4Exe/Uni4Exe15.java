/* Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário.
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses.
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
 */

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Há quanto tempo você foi admitido na empresa? (em meses): ");
        int tempo = Integer.parseInt(teclado.nextLine());

        if (tempo <= 12) {
            System.out.println("Você terá um reajuste de 5%");
        } else if (tempo >= 13 && tempo <= 48) {
            System.out.println("Você terá um reajuste de 7%");
        } else {
            System.out.println("Você não terá reajuste");
        }
        teclado.close();
    }
}
