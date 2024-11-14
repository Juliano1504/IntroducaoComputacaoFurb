import java.util.Scanner;

public class UniUri1114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        while (true) {
            senha = scanner.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        scanner.close();
    }
}
