import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";

        while (true) {
            System.out.println("Insira o nome do aluno (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.println("Insira a nota da prova 1: ");
            double nota1 = scanner.nextInt();

            System.out.println("Insira a nota da prova 2: ");
            double nota2 = scanner.nextInt();

            scanner.nextLine();

            double media = (nota1 + nota2) / 2;

            System.out.println("A media do aluno: " + nome + " é igual : " + media);
        }
        scanner.close();
    }
}
