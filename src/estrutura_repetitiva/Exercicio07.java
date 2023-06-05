package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();

        for (int i = 0; i < numero; i++){
            System.out.println("Digite um número:");
            double A = leia.nextDouble();

            System.out.println("Digite outro número");
            double B = leia.nextDouble();

            if(B == 0){
                System.out.println("divisão impossivel!");
            }else{
                double divisao = A/B;

                System.out.println(divisao);
            }

        }


        leia.close();
    }
}
