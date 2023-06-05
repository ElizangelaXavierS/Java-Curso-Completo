package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();

        for(int i = 1; i <= numero; i++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d%n", i,quadrado, cubo);
    }
}}
