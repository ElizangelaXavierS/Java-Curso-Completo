package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {
            System.out.println("--------------------------");
            System.out.println("         1 Álcool         ");
            System.out.println("         2 Gasolina       ");
            System.out.println("         3 Diesel         ");
            System.out.println("         4 Fim            ");
            System.out.println("--------------------------");
            codigo = leia.nextInt();

            switch (codigo) {
                case 1:
                    alcool = alcool + 1;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("Muito obrigada");
                    System.out.println("Alcool: " + alcool);
                    System.out.println("Gasolina: " + gasolina);
                    System.out.println("Diesel: " + diesel);
                break;
                default:
                    System.out.println("Código inálido, digite novamente.");
            }
        }
    }
}