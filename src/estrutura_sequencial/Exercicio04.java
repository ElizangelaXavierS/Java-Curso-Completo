package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        int numFuncionario = leia.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        double numHoras = leia.nextDouble();

        System.out.println("Digite o valor da hora:");
        double valorHora= leia.nextDouble();

        double salario = numHoras * valorHora;
        System.out.printf(" Número de funcionário = %s %n Salario = R$ %.2f reais%n", numFuncionario, salario);
    }
}
