package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();

        double media = 0;

        for (int i = 0; i < numero; i++){

            System.out.println("Digite o primeiro número:");
            double A = leia.nextDouble();

            System.out.println("Digite o segundo número:");
            double B = leia.nextDouble();

            System.out.println("Digite o teceiro número:");
            double C = leia.nextDouble();

            media =  (A * 2 + B * 3 + C * 5)/10;

            System.out.printf( "%.1f%n", media);
        }

    }
}
