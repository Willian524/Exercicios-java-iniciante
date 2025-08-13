package ex03;

import java.util.Scanner;

/**
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        do {
            System.out.println("Digite o valor de x: ");
            x = sc.nextDouble();

            System.out.println("Digite o valor de y: ");
            y = sc.nextDouble();
            
            if(x > 0 && y > 0){
                System.out.println("Quadrante 1!");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2!");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3!");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante 4!");
            }else {
                System.out.println("Origem");
            }

        }while (x != 0 && y !=0);

        
    }
}
