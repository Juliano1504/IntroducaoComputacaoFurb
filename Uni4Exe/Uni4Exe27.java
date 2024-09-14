/* As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo.
Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima.
Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora
e quem estacionar por 1 hora e 35 minutos pagará por duas horas.
Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora.
Os horários de chegada e partida são apresentados na forma de pares de inteiros,
representando horas e minutos. Por exemplo, o par 12 50 representará meio-dia e cinquenta.
Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo
que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados.
Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas,
e sempre chegam e saem no mesmo dia. */


import java.util.Scanner;

class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hora de chegada: ");
        int horaChegada = teclado.nextInt();

        System.out.println("Minuto chegada: ");
        int minChegada = teclado.nextInt();

        System.out.println("Hora de saída: ");
        int horaSaida = teclado.nextInt();

        System.out.println("Minuto saída: ");
        int minSaida = teclado.nextInt();

        if (horaChegada < 0 || horaChegada >= 24 || horaSaida < 0 || horaSaida >= 24 || minChegada < 0 ||
                minChegada >= 60 || minSaida < 0 || minSaida >= 60) {
            System.out.println("Horários inválidos");
        } else if (horaSaida < horaChegada || horaSaida == horaChegada && minSaida < minChegada) {
            System.out.println("A saída não pode ser antes da chegada");
        } else {
            int tempoChegada = horaChegada * 60 + minChegada;
            int tempoSaida = horaSaida * 60 + minSaida;
            int tempoTotal = tempoSaida - tempoChegada;

            int horasCobradas = tempoTotal / 60;
            int minRestantes = tempoTotal % 60;

            if (minRestantes > 0) {
                if (minRestantes >= 30) {
                    horasCobradas++;
                }
            }

            double precoTotal = 0;

            switch (horasCobradas) {
                case 0:
                case 1:
                case 2:
                    if (horasCobradas < 1) {
                        precoTotal = 5;
                    } else {
                        precoTotal = horasCobradas * 5;
                    }
                    break;
                case 3:
                case 4:
                    precoTotal = 2 * 5 + (horasCobradas - 2) * 7.5;
                    break;
                default:
                    if (horasCobradas >= 5) {
                        precoTotal = 2 * 5 + 2 * 7.5 + (horasCobradas - 4) * 10;
                    }
                    break;
            }

            System.out.println("Valor a pagar = R$ " + precoTotal);
        }
        teclado.close();
    }
}
