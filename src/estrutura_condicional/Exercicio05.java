package estrutura_condicional;

import java.util.Scanner;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar*/
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("   CÓDIGO    ESPECIFICAÇÕES   PREÇO   ");
        System.out.println("--------------------------------------");
        System.out.println("                                      ");
        System.out.println("     1      Cachoro Quente   R$ 4.00  ");
        System.out.println("     2      X-Salada         R$ 4.50  ");
        System.out.println("     3      X-Bacon          R$ 5.00  ");
        System.out.println("     4      Torrada Simples  R$ 2.00  ");
        System.out.println("     5      Refrigerante     R$ 1.50  ");
        System.out.println("                                      ");
        System.out.println("--------------------------------------");
        int codigo = leia.nextInt();

        System.out.println("Digite a quantidade:");
        float quantidade = leia.nextInt();

        float total;

        switch (codigo){
            case 1:
                total = quantidade * 4;
                System.out.println("O total foi de R$ " + total);
            break;
            case 2:
                total = quantidade * (float) 4.5;
                System.out.println("O total foi de R$ " + total);
            break;
            case 3:
                total = quantidade * 5;
                System.out.println("O total foi de R$ " + total);
            break;
            case 4:
                total = quantidade * 2;
                System.out.println("O total foi de R$ " + total);
                break;
            case 5:
                total = quantidade * (float) 1.5;
                System.out.println("O total foi de R$ " + total);
                break;
            default:
                System.out.println("Código Inválido");


        }
    }
}
