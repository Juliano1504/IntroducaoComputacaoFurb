import java.util.Scanner;

public class UniUri1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            
            if (X == 0) {
                System.out.println("NULL");
            } else {
                String paridade = (X % 2 == 0) ? "EVEN" : "ODD";
                String sinal = (X > 0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(paridade + " " + sinal);
            }
        }

        scanner.close();
    }
}