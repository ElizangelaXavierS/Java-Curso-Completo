package estrutura_sequencial;
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo.*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int A = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int B = leia.nextInt();

        System.out.println("Digite o terceiro número:");
        int C = leia.nextInt();

        System.out.println("Digite o quarto número:");
        int D = leia.nextInt();

        int difereca = (A * B) - (C * D);

        System.out.println("Diferença = " + difereca);

    }
}
