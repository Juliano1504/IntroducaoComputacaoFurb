public class Uni5Exe11 {
    public static void main(String[] args) {

        int totalBiscoitosQuebrados = 0;
        int biscoitosQuebradosHoraAnterior = 0;

        for (int i = 1; i <= 16; i++) {
            int biscoitosQuebradosNahora;

            if (i == 1) {
                biscoitosQuebradosNahora = 1;
            } else if (i == 2) {
                biscoitosQuebradosNahora = 3;
            } else {
                biscoitosQuebradosNahora = biscoitosQuebradosHoraAnterior * 3;
            }

            totalBiscoitosQuebrados += biscoitosQuebradosNahora;
            biscoitosQuebradosHoraAnterior = biscoitosQuebradosNahora;

            System.out.println(biscoitosQuebradosNahora);
        }
        System.out.println(totalBiscoitosQuebrados);
    }
}
