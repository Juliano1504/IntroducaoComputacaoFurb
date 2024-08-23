/* Leia um valor inteiro, que é o tempo de duração em segundos
 de um determinado evento em uma fábrica, e informe-o expresso
  no formato horas:minutos:segundos. */

import java.util.Scanner;

public class UniUri1019 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int horas, minutos, segundos;

        horas = numero / 3600;
        minutos = (numero % 3600) / 60;
        segundos = numero % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        teclado.close();
    }
}
