package estrutura_sequencial;

import java.util.Scanner;

/*

 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = leia.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A Soma = " + soma);
    }
}
