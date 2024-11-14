import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor inicial N: ");
        int N = scanner.nextInt();
        
        System.out.print("Digite o decremento K: ");
        int K = scanner.nextInt();
        
        System.out.print("Digite a capacidade da mochila M: ");
        int M = scanner.nextInt();

        List<Integer> elementos = new ArrayList<>();
        
        int elemento = N;
        while (elemento > 0) {
            elementos.add(elemento);
            elemento -= K;
        }
        
        List<Integer> mochila = new ArrayList<>();
        int somaMochila = 0;
        int somaFora = 0;
        
        System.out.println("\nElementos a serem considerados:");
        for (int el : elementos) {
            System.out.print(el + " ");
        }
        
        System.out.println("\n\nColocando elementos na mochila:");
        int i = 0;
        while (i < elementos.size()) {
            elemento = elementos.get(i);
            if (somaMochila + elemento <= M) {
                mochila.add(elemento);
                somaMochila += elemento;
                System.out.println("Adicionado: " + elemento);
            } else {
                somaFora += elemento;
            }
            i++;
        }
        
        System.out.println("\nElementos que entraram na mochila:");
        for (int item : mochila) {
            System.out.print(item + " ");
        }
        
        System.out.println("\n\nElementos que ficaram fora da mochila:");
        for (int el : elementos) {
            if (!mochila.contains(el)) {
                System.out.print(el + " ");
            }
        }
        
        System.out.println("\n\nSoma dos elementos que entraram na mochila: " + somaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);
        
        scanner.close();
    }
}
