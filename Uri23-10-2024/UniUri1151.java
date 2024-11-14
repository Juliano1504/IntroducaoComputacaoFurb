import java.util.Scanner;

public class UniUri1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] fibonacci = new int[N];

        if (N >= 1) {
            fibonacci[0] = 0;
        }
        if (N >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}