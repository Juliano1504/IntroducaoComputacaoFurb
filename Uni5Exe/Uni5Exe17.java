import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inscricao_alto = 0, inscricao_baixo = 0;
        double altura_alto = 0, altura_baixo = 0;
        double soma_alturas = 0;
        int quant_atletas = 0;
        
        while (true) {
            System.out.print("Digite o número de inscrição (ou 0 para sair): ");
            int inscricao = scanner.nextInt();
            if (inscricao == 0) {
                break;
            }

            System.out.print("Digite a altura do atleta: ");
            double altura = scanner.nextDouble();
            
            if (quant_atletas == 0) {
                inscricao_alto = inscricao_baixo = inscricao;
                altura_alto = altura_baixo = altura;
            } else {
                if (altura > altura_alto) {
                    altura_alto = altura;
                    inscricao_alto = inscricao;
                }
                if (altura < altura_baixo) {
                    altura_baixo = altura;
                    inscricao_baixo = inscricao;
                }
            }
            
            soma_alturas += altura;
            quant_atletas++;
        }

        if (quant_atletas > 0) {
            double media_alturas = soma_alturas / quant_atletas;
            System.out.printf("Atleta mais alto: Inscrição %d, Altura %.2f%n", inscricao_alto, altura_alto);
            System.out.printf("Atleta mais baixo: Inscrição %d, Altura %.2f%n", inscricao_baixo, altura_baixo);
            System.out.printf("Altura média do grupo: %.2f%n", media_alturas);
        } else {
            System.out.println("Nenhum atleta foi informado.");
        }

        scanner.close();
    }
}
