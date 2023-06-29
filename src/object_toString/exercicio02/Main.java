package object_toString.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario:");
        funcionario.name = leia.next();

        System.out.println("Digite o valor do salario bruto:");
        funcionario.salarioBruto = leia.nextDouble();

        System.out.println("Digite o valor do imposto:");
        funcionario.imposto = leia.nextDouble();


        System.out.println("Nome: " + funcionario.name);
        System.out.println("SalárioBruto: " + funcionario.salarioBruto);
        System.out.println("Imposto: " + funcionario.imposto);

        System.out.println("Funcionario: " + funcionario.name + ", " + funcionario.salarioLiquido());

        System.out.print("Qual o pecentual de aumento:");
        funcionario.aumentoSalario(leia.nextDouble());

        System.out.println("Dados atualizados:" + funcionario.name + ", " + funcionario.salarioLiquido());


        leia.close();


    }

}
