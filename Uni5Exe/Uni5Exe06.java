public class Uni5Exe06 {
    public static void main(String[] args) {

        double soma = 0;
        int contagem = 0;

        for (double altura = 1.60; altura <= 1.81; altura = altura + 0.01) {
            System.out.printf("%.2f%n", altura);
            soma += altura;
            contagem++;
        }

        double media = soma / contagem;

        System.out.printf("A média das alturas é %.2f%n ", media);
    }
}
