/* Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
Considerando que o sistema apresenta 3 cursos disponíveis 
(1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) 
descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título 
que o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: 
"Bacharel em Ciência da Computação", "Licenciado em Computação" e "Bacharel em Sistemas de Informação". */

import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual curso você quer? ");
        int curso = Integer.parseInt(teclado.nextLine());

        switch (curso) {
            case 1:
                System.out.println("Ciência da computação");
                break;
            case 2:
                System.out.println("Licenciatura da computação");
                break;
            case 3:
                System.out.println("Sistemas de Informação");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        teclado.close();
    }
}
