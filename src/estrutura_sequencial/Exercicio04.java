package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

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

        double salario = (double) numHoras * valorHora;

        //System.out.printf("Numero Funcionário: " + numFuncionario + "%n Salario = %2.f" +(double) salario);
        System.out.printf(" Número de funcionário = %s %n Salario = R$ %.2f reais%n", numFuncionario, salario);
    }
}
