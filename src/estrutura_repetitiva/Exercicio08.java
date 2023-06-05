package estrutura_repetitiva;

import java.util.Scanner;

public  class Exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

        leia.close();

    }
}
