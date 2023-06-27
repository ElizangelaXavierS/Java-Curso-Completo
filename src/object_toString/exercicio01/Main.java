package object_toString.exercicio01;

import object_toString.exercicio01.Calcular;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo:");
        double largura = leia.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        double altura = leia.nextDouble();

        double area = Calcular.area(largura, altura);
        System.out.printf("Area = %.2f\n", area);

        double perimetro = Calcular.perimetro(largura, altura);
        System.out.printf("Perimetro = %.2f\n", perimetro);

        double diagonal = Calcular.diagonal(largura,altura);
        System.out.printf("Diagonal = %.2f\n", diagonal);

        leia.close();

    }
}
