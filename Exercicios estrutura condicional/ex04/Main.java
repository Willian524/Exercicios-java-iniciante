package ex04;

import java.util.Scanner;

/**
 *
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio:");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora de termino:");
        int horaTermino = sc.nextInt();
        int duracaoTotal;
        if(horaInicio < horaTermino){
            duracaoTotal = horaTermino - horaInicio;
        }
        else{

        duracaoTotal = 24 - horaInicio  + horaTermino;
        }

        System.out.println("O jogo durou " + duracaoTotal + " hora(s)");


        sc.close();
    }
}
