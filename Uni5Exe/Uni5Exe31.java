import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("número\tdecomposição");
        
        while (numero > 1) {
            int fator = 2;
            while (numero % fator != 0) {
                fator++;
            }
            System.out.println(numero + "\t" + fator);
            numero /= fator;
        }
        
        System.out.println("1\t");
        
        scanner.close();
    }
}
