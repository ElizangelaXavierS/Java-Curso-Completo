package encapsulamento.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println();
        System.out.println("Informações do produto: " + produto);
        System.out.println();
        System.out.print("Informe a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        System.out.println();
        System.out.print("Insira o número de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        sc.close();
    }
}
