import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorProducao = 0;
        int diaMaiorProducao = 0;
        int turnoMaiorProduzido = 0;
        int producaoTurnoMaior = 0;
        
        while (true) {
            int dia;
            do {
                System.out.print("Dia: ");
                dia = scanner.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);
            
            System.out.print("Produção turno da manhã: ");
            int producaoManha = scanner.nextInt();
            System.out.print("Produção turno da tarde: ");
            int producaoTarde = scanner.nextInt();
            double valorRecebido;

            if (dia <= 15) {
                if (producaoManha + producaoTarde > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = (producaoManha + producaoTarde) * 0.80;
                } else {
                    valorRecebido = (producaoManha + producaoTarde) * 0.50;
                }
            } else {
                valorRecebido = (producaoManha * 0.40) + (producaoTarde * 0.30);
            }
            
            System.out.printf("R$ %.2f (valor recebido)%n", valorRecebido);

            if (producaoManha + producaoTarde > maiorProducao) {
                maiorProducao = producaoManha + producaoTarde;
                diaMaiorProducao = dia;
            }

            if (producaoManha > producaoTarde) {
                if (producaoManha > producaoTurnoMaior) {
                    turnoMaiorProduzido = 1;
                    producaoTurnoMaior = producaoManha;
                }
            } else {
                if (producaoTarde > producaoTurnoMaior) {
                    turnoMaiorProduzido = 2;
                    producaoTurnoMaior = producaoTarde;
                }
            }

            System.out.print("Novo funcionário (1- sim 2- não)? ");
            int resposta = scanner.nextInt();
            if (resposta != 1) {
                break;
            }
        }

        System.out.println("Dia da maior produção: " + diaMaiorProducao);
        System.out.println("Turno com maior produção: " + (turnoMaiorProduzido == 1 ? "Manhã" : "Tarde") + 
                           " com " + producaoTurnoMaior + " peças.");
        scanner.close();
    }
}
