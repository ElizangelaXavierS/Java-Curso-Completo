package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        double salarioImposto;
        System.out.println("Digite o salario");
        float salario = leia.nextFloat();

        if (salario > 0 && salario <= 2000){
            System.out.println("Isento");

        }else if(salario > 2000 && salario <= 3000) {
            salarioImposto = (salario - 2000) * 0.08;
            System.out.println(salarioImposto);

        }else if(salario > 3000 && salario <= 4500){
        salarioImposto = (salario - 3000)* 0.18 + 1000 * 0.08;
            System.out.println(salarioImposto);

        }else {
            salarioImposto = (salario - 4500)*0.28 + 1500 *0.18 + 1000 * 0.08;
            System.out.println(salarioImposto);
        }
    }}