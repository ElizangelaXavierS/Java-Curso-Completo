package estrutura_condicional;

import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo:");
        int horaInicial = leia.nextInt();

        System.out.println("Digite a hora final do jogo:");
        int horafinal = leia.nextInt();

        int duracao;
        if (horaInicial < horafinal){
            duracao = horafinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horafinal;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");

        leia.close();
    }
}
