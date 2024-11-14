import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];
        int tamanho = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor(vetor, scanner, tamanho);
                    if (tamanho < 50) tamanho++;
                    break;
                case 2:
                    pesquisarValor(vetor, scanner, tamanho);
                    break;
                case 3:
                    alterarValor(vetor, scanner, tamanho);
                    break;
                case 4:
                    excluirValor(vetor, scanner, tamanho);
                    if (tamanho > 0) tamanho--;
                    break;
                case 5:
                    mostrarValores(vetor, tamanho);
                    break;
                case 6:
                    ordenarValores(vetor, tamanho);
                    break;
                case 7:
                    inverterValores(vetor, tamanho);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void incluirValor(int[] vetor, Scanner scanner, int tamanho) {
        if (tamanho < 50) {
            System.out.print("Digite o valor a ser incluído: ");
            int valor = scanner.nextInt();
            vetor[tamanho] = valor;
            System.out.println("Valor " + valor + " incluído com sucesso.");
        } else {
            System.out.println("Não há espaço para mais valores no vetor.");
        }
    }

    public static void pesquisarValor(int[] vetor, Scanner scanner, int tamanho) {
        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = scanner.nextInt();
        boolean encontrado = false;
        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor " + valor + " encontrado no vetor.");
        } else {
            System.out.println("Valor " + valor + " não encontrado no vetor.");
        }
    }

    public static void alterarValor(int[] vetor, Scanner scanner, int tamanho) {
        System.out.print("Digite o valor a ser alterado: ");
        int valorAntigo = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valorAntigo) {
                System.out.print("Digite o novo valor: ");
                int novoValor = scanner.nextInt();
                vetor[i] = novoValor;
                System.out.println("Valor alterado de " + valorAntigo + " para " + novoValor + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
    }

    public static void excluirValor(int[] vetor, Scanner scanner, int tamanho) {
        System.out.print("Digite o valor a ser excluído: ");
        int valor = scanner.nextInt();
        boolean excluido = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                vetor[tamanho - 1] = 0;
                excluido = true;
                System.out.println("Valor " + valor + " excluído com sucesso.");
                break;
            }
        }

        if (!excluido) {
            System.out.println("Valor não encontrado.");
        }
    }

    public static void mostrarValores(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio.");
        } else {
            System.out.println("Valores no vetor:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado em ordem crescente.");
    }

    public static void inverterValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - i - 1];
            vetor[tamanho - i - 1] = temp;
        }
        System.out.println("Vetor invertido.");
    }
}