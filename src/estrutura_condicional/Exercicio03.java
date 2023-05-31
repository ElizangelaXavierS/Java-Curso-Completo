package estrutura_condicional;

import java.util.Scanner;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int b = leia.nextInt();

        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("Os númeos são multiplos!");
        }else {
            System.out.println("Os números não são multiplos!");
        }
    }
}
