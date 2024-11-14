import java.util.ArrayList;
import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos na sala: ");
        int n = scanner.nextInt();

        int contador20 = 0;
        ArrayList<String> alunos18 = new ArrayList<>(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "° aluno: ");
            String nome = scanner.next(); 

            System.out.println("E a idade: ");
            int idade = scanner.nextInt(); 

            if (idade > 20) {
                contador20++;
            }

            if (idade == 18) {
                alunos18.add(nome); 
            }
        }

        System.out.println("Quantidade de alunos que têm mais de 20 anos: " + contador20);
        
        if (!alunos18.isEmpty()) {
            System.out.println("Alunos que têm 18 anos: " + alunos18);
        } else {
            System.out.println("Nenhum aluno tem 18 anos.");
        }

        scanner.close();
    }
}
