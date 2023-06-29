package object_toString.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a primeira nota:");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        aluno.nota3= sc.nextDouble();

        double notaFinal = aluno.notaFinal();

        if (notaFinal> 60){
            System.out.println("Nota Final:" + notaFinal);
            System.out.println("Aprovado");
        }else{
            System.out.println("Nota Final:"+ notaFinal);
            System.out.println("Reprovado! ");
            System.out.println("Faltou: " + (60 - notaFinal));
        }

        sc.close();


    }
}
