import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1005 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double media;

        media = ((nota1*3.5) + (nota2*7.5)) / 11;

        System.out.println("MEDIA = " + df_5.format(media));
        teclado.close();
    }
}
