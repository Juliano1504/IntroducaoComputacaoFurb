import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        int[][] dados = new int[30][3];
        lerDados(dados);
        
        double mediaCinema = calcularMediaCinema(dados);
        System.out.println("Nota média recebida pelo cinema: " + mediaCinema);
        
        double mediaHomens = calcularMediaHomens(dados);
        System.out.println("Nota média atribuída pelos homens: " + mediaHomens);
        
        int notaMulherMaisJovem = notaMulherMaisJovem(dados);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        
        int mulheresMaisDe50AcimaMedia = mulheresMaisDe50AcimaMedia(dados, mediaCinema);
        System.out.println("Número de mulheres com mais de 50 anos que deram nota superior à média do cinema: " + mulheresMaisDe50AcimaMedia);
    }

    public static void lerDados(int[][] dados) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 30; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.print("Sexo (1 = feminino, 2 = masculino): ");
            dados[i][0] = scanner.nextInt();
            System.out.print("Nota (0 a 10): ");
            dados[i][1] = scanner.nextInt();
            System.out.print("Idade: ");
            dados[i][2] = scanner.nextInt();
            System.out.println();
        }   
        scanner.close();
    }

    public static double calcularMediaCinema(int[][] dados) {
        int somaNotas = 0;
        
        for (int i = 0; i < 30; i++) {
            somaNotas += dados[i][1];
        }
        return somaNotas / 30.0;
    }

    public static double calcularMediaHomens(int[][] dados) {
        int somaNotas = 0;
        int contadorHomens = 0;
        
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 2) {
                somaNotas += dados[i][1];
                contadorHomens++;
            }
        }        
        return contadorHomens > 0 ? somaNotas / (double) contadorHomens : 0;
    }

    public static int notaMulherMaisJovem(int[][] dados) {
        int menorIdade = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;
        
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 1 && dados[i][2] < menorIdade) {
                menorIdade = dados[i][2];
                notaMulherMaisJovem = dados[i][1];
            }
        }      
        return notaMulherMaisJovem;
    }

    public static int mulheresMaisDe50AcimaMedia(int[][] dados, double mediaCinema) {
        int contador = 0;
        
        for (int i = 0; i < 30; i++) {
            if (dados[i][0] == 1 && dados[i][2] > 50 && dados[i][1] > mediaCinema) {
                contador++;
            }
        } 
        return contador;
    }
}
