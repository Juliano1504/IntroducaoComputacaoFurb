import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Cria o tabuleiro (Matriz 8x8)
        char[][] tabuleiro = new char[8][8];

        // Coloca '~' em cada espaço do tabuleiro
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        // Adiciona 10 barcos em posicoes aleatorias
        int barcosAdicionados = 0;
        while (barcosAdicionados < 10) {
            int linha = random.nextInt(8);
            int coluna = random.nextInt(8);

            if (tabuleiro[linha][coluna] == '~') {
                tabuleiro[linha][coluna] = 'N';
                barcosAdicionados++;
            }
        }

        // Mostra o mapa atual para o usuario na primeira tentativa

        System.out.println("Mapa atual: ");

        // Colocar numeros em volta
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == 'N') {
                    System.out.print("~ ");
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }

        // Interacao com o usuario
        int tentativas = 30;
        int acertos = 0;
        do {
            System.out.println(tentativas + " tentativas restantes");
            System.out.println("Digite as coordenadas para atacar (linha e coluna, separadas por espaço): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println("Coordenada inválida! Tente novamente");
                tentativas--;

                System.out.println("Mapa atual: ");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (tabuleiro[i][j] == 'N') {
                            System.out.print("~ ");
                        } else {
                            System.out.print(tabuleiro[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            } else if (tabuleiro[linha][coluna] == 'N') {
                System.out.println("Acertou! Há um navio nessa posição");
                tabuleiro[linha][coluna] = 'A';
                acertos++;
                tentativas--;

                System.out.println("Mapa atual: ");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (tabuleiro[i][j] == 'N') {
                            System.out.print("~ ");
                        } else {
                            System.out.print(tabuleiro[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Errou! Não há nada nessa posição");
                tabuleiro[linha][coluna] = 'X';
                tentativas--;

                System.out.println("Mapa atual: ");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (tabuleiro[i][j] == 'N') {
                            System.out.print("~ ");
                        } else {
                            System.out.print(tabuleiro[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }

            if (acertos == 10) {
                System.out.println("Parabéns! Você encontrou todos os navios");
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();
                    scanner.close();
                }
                break;
            }

        } while (tentativas < 30);

        if (tentativas == 30) {
            System.out.println("Suas tentivas acabaram! Mais sorte na próxima");
            System.out.println("Posição dos navios: ");
            for (int j = 0; j < 8; j++) {
                for (int l = 0; l < 8; l++) {
                    System.out.print(tabuleiro[j][l] + " ");
                }
                System.out.println();
                scanner.close();
            }
        }
    }
}
