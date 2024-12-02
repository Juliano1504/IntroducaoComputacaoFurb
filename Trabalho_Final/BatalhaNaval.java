import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Criação do tabuleiro
        char[][] tabuleiro = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        // Adiciona 10 navios ao tabuleiro
        int barcosAdicionados = 0;
        while (barcosAdicionados < 10) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);
            if (tabuleiro[linha][coluna] == '~') {
                tabuleiro[linha][coluna] = 'N';
                barcosAdicionados++;
            }
        }

        // Criação da instância da classe BatalhaNaval para poder chamar o método
        BatalhaNaval jogo = new BatalhaNaval();

        int tentativas = 30;
        int acertos = 0;

        // Loop principal do jogo
        while (tentativas > 0) {
            jogo.exibirTabuleiro(tabuleiro, false);
            System.out.println();
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite as coordenadas para atacar (linha e coluna):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println();
                System.out.println("Coordenada inválida! Tente novamente.");
                System.out.println();
            } else if (tabuleiro[linha][coluna] == 'N') {
                System.out.println();
                System.out.println("Acertou! Há um navio nessa posição.");
                System.out.println();
                tabuleiro[linha][coluna] = 'A';
                acertos++;
            } else if (tabuleiro[linha][coluna] == 'A' || tabuleiro[linha][coluna] == 'X') {
                System.out.println();
                System.out.println("Você já jogou nessa posição! Tente novamente.");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Errou! Não há nada nessa posição.");
                System.out.println();
                tabuleiro[linha][coluna] = 'X';
            }

            tentativas--;

            if (acertos == 10) {
                System.out.println("Parabéns! Você encontrou todos os navios!");
                break;
            }
        }

        if (acertos < 10) {
            System.out.println("Suas tentativas acabaram! Mais sorte na próxima.");
        }

        System.out.println("Posição dos navios:");
        System.out.println();
        jogo.exibirTabuleiro(tabuleiro, true);
        scanner.close();
    }

    // Exibe o tabuleiro
    private void exibirTabuleiro(char[][] tabuleiro, boolean revelarNavios) {
        for (int col = 0; col < tabuleiro.length; col++) {
            if (col == 0) {
                System.out.print("  " + col);
            } else {
                System.out.print(" " + col);
            }
        }
        System.out.println();

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (!revelarNavios && tabuleiro[i][j] == 'N') {
                    System.out.print("~ ");
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
