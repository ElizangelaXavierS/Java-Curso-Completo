package estrutura_repetitiva;

import java.util.Scanner;
/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

public class ExercicioWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        int senha = leia.nextInt();

        while(senha != 2002){
            System.out.println("Senha Inválida!");

            System.out.println("Digite novamente:");
            senha = leia.nextInt();
        }
        System.out.println("Acesso Permitido!");
    }
}
