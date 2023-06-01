package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a cordenada x:");
        int x = leia.nextInt();

        System.out.println("Digite a cordenada y:");
        int y = leia.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else
                System.out.println("Quarto");

            System.out.println("Digite a cordenada x:");
            x = leia.nextInt();

            System.out.println("Digite a cordenada y:");
            y = leia.nextInt();


        }
    }
}