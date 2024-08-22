/* Uma empresa tem para um funcionário os seguintes dados:
 o nome, o número de horas trabalhadas mensais e o número de dependentes.
A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho)
e R$ 60,00 por dependente (valor para cálculo do salário família) 
e são feitos descontos de 8,5% sobre o salário trabalho para o INSS
e de 5% sobre o salário trabalho para o imposto de renda.
Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
 */


 import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        
        int dependentes, salarioFamilia;
        double salarioBruto, salarioLiquido, horas, descontos;
        String nome;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();     //Quando a variavel é do tipo String usamos o comando teclado.nextLine ao inves de .nextDouble ou .nextInt por exemplo

        System.out.print("Digite quantas horas você trabalhou: ");
        horas = teclado.nextDouble();

        System.out.print("Digite o seu número de dependentes: ");
        dependentes = teclado.nextInt();

        salarioFamilia = 60 * dependentes;

        salarioBruto = horas * 10 + salarioFamilia;

        descontos = (salarioBruto - salarioFamilia) * 0.135;

        salarioLiquido = salarioBruto - descontos;

        System.out.println("Funcionário: " + nome);
        System.out.println("Valor salário bruto = R$ " + salarioBruto);
        System.out.println("Valor salário líquido = R$ " + salarioLiquido);
        teclado.close();
    }
}
