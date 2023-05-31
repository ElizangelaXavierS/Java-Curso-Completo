package estrutura_condicional;

import java.util.Scanner;
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();
        if(numero < 0) {
            System.out.println("Número negativo!");
        }else {
            System.out.println("Número positivo!");
        }
    }
}
