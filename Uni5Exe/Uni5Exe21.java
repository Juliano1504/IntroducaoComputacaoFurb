public class Uni5Exe21{
    public static void main(String[] args) {
        double altura_chico = 150;
        double altura_ze = 110;
        int anos = 0;
        
        while (altura_ze <= altura_chico) {
            altura_chico += 2;
            altura_ze += 3;
            anos++;
        }
        
        System.out.printf("Serão necessários %d anos para que Zé seja maior que Chico.%n", anos);
    }
}
