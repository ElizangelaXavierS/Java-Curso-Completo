package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o código da primeira peça:");
        int codigo1 = leia.nextInt();

        System.out.println("Digite o número da primeira  peça:");
        int numero1 = leia.nextInt();

        System.out.println("Digite o valor unitário de cada peça:");
        double valor1 = leia.nextDouble();

        System.out.println("Digite o código da segunda peça:");
        int codigo2 = leia.nextInt();

        System.out.println("Digite o número da segunda  peça:");
        int numero2= leia.nextInt();

        System.out.println("Digite o valor unitário de cada peça:");
        double valor2= leia.nextDouble();

        double peca1 = (double) numero1 * valor1;
        double peca2 = (double) numero2 * valor2;
        double pecas = peca1 + peca2;

        System.out.printf("Valor a pagar = R$%.2f",pecas);
    }
}
