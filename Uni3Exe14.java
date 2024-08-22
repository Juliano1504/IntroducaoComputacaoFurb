/* Descreva um programa que a partir da distância percorrida 
e o do tempo gasto por um motorista durante uma viagem de final de semana, 
calcule a velocidade média e a quantidade de combustível gasto na viagem, 
sabendo que o automóvel faz 12 km por litro. */

import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        
        double distancia, tempo, velocidadeMedia, combustivel;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Distância total percorrida na viagem = ");
        distancia = teclado.nextDouble();

        System.out.print("Tempo total de viagem = ");
        tempo = teclado.nextDouble();

        velocidadeMedia = distancia / tempo;

        combustivel = distancia / 12;

        System.out.println("Velocidade média durante a viagem = " + velocidadeMedia + " Km/h");
        System.out.println("Total combustível gasto durante a vigem = " + combustivel + " litros");

        teclado.close();
    }
}
