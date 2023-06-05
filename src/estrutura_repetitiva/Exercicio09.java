package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = leia.nextInt();

        for (int i = 1; i <= numero;i++){
            if( numero % i == 0){
                System.out.println(i);
            }
        }

    }

}
