package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double A = leia.nextDouble();

        System.out.println("Digite o segundo número:");
        double B = leia.nextDouble();

        System.out.println("Digite o terceiro número:");
        double C = leia.nextDouble();

        double triangulo= (A * C)/2;
        double circulo = 3.14159 * Math.pow(C , 2);
        double trapezio = ((A + B) * C)/2;
        double quadrado = Math.pow(B , 2);
        double retangulo = A * B;

        System.out.printf("Trianculo = %.3f%n Circulo = %.3f%n Trapezio = %.3f%n Quadrado = %.3f%n Retangulo = %.3f%n "
                ,triangulo, circulo,trapezio,quadrado,retangulo);
    }
}
