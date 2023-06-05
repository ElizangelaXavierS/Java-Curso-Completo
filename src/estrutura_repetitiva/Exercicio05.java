package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite un número:");
        int n = leia.nextInt();

        int intervaloD = 0;
        int intervaloF = 0;

        for (int i = 0; i < n; i++){

            System.out.println("Digite o número:");
            int x = leia.nextInt();

            if( x >= 10 && x <= 20){
                intervaloD = intervaloD + 1;
            }else
                intervaloF = intervaloF + 1;
        }
        System.out.println("Intervalo dentro: " + intervaloD);
        System.out.println("Intervalo fora: " + intervaloF);
    }
}
