/* Leia os quatro valores correspondentes aos eixos x e y de
 dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule
  a distância entre eles, mostrando 4 casas decimais, segundo a fórmula: */

import java.text.DecimalFormat;
import java.util.Scanner;

public class UniUri1015 {
    public static void main(String[] args) {
        
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        Scanner teclado = new Scanner(System.in);

        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();
        double distancia;

        distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));

        System.out.println(df_4.format(distancia));
        teclado.close();
    }
}
