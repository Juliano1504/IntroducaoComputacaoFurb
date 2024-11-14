public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;

        for (int i = 1; i <= 20; i++) {
            int numerador = 2 * i + 1;
            int denominador = i * (i + 1);
            double fracao = (double) numerador / denominador;
            soma += fracao;
        }

        System.out.println("O valor de S é: " + soma);
    }
}
