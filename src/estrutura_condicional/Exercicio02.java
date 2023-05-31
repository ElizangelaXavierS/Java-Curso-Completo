package estrutura_condicional;

import java.util.Scanner;
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Difite um número:");
        int  numero = leia.nextInt();

        if(numero%2 == 0){
            System.out.println("Número é PAR!");
        }else {
            System.out.println("Número é IMPAR!");
        }
    }
}
