import java.util.Calendar;

public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario_inicial = 2000.00;
        double percentual_aumento = 0.015;
        double salario_atual = salario_inicial;
        
        int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
        
        for (int ano = 1996; ano <= ano_atual; ano++) {
            salario_atual += salario_atual * percentual_aumento;
            percentual_aumento *= 2;
        }
        
        System.out.printf("O salário atual do funcionário em %d é R$ %.2f%n", ano_atual, salario_atual);
    }
}
