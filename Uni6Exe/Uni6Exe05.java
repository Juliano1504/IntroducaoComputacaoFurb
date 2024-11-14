import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        String[][] respostas = lerRespostas();
        int soma = resultadoPesquisa(respostas[0], respostas[1]);
        exibirResultado(soma);
    }

    public static String[][] lerRespostas() {
        Scanner scanner = new Scanner(System.in);
        String respostasH[] = new String[5];
        String respostasM[] = new String[5];

        System.out.println("Respostas do homem");
        for (int i = 0; i < respostasH.length; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            respostasH[i] = scanner.nextLine().toUpperCase();
        }

        System.out.println("Respostas da mulher");
        for (int i = 0; i < respostasM.length; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            respostasM[i] = scanner.nextLine().toUpperCase();
        }

        scanner.close();
        return new String[][] { respostasH, respostasM };
    }

    public static int resultadoPesquisa(String[] respostasH, String[] respostasM) {
        int soma = 0;
        for (int i = 0; i < respostasH.length; i++) {
            if (respostasH[i].equals(respostasM[i])) {
                soma += 3;
            } else if (respostasH[i].equals("IND") || respostasM[i].equals("IND")) {
                soma += 1;
            } else {
                soma -= 2;
            }
        }
        return soma;
    }

    public static void exibirResultado(int soma) {
        System.out.println("Resultado da pesquisa");
        if (soma == 15) {
            System.out.println("Casem!");
        } else if (soma >= 10 && soma <= 14) {
            System.out.println("Voces tem muita coisa em comum!");
        } else if (soma >= 5 && soma <= 9) {
            System.out.println("Talvez nao de certo :(");
        } else if (soma >= 0 && soma <= 4) {
            System.out.println("Vale um encontro");
        } else if (soma >= -1 && soma <= -9) {
            System.out.println("Melhor nao perder tempo");
        } else {
            System.out.println("Voces se odeiam!");
        }
    }

}