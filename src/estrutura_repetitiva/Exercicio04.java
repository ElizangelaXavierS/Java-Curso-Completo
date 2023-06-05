package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int x = leia.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
