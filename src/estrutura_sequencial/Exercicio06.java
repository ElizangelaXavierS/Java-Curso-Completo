package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B*/

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
