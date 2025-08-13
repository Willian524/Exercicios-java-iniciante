package ex06;

import java.util.Scanner;

/**
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        double media =0;

       for(int i = 0; i < n; i++){
           System.out.println("Digite o primeiro valor: ");
           double v1 = sc.nextDouble();
           System.out.println("Digite o segundo valor: ");
           double v2 = sc.nextDouble();
           System.out.println("Digite o terceiro valor: ");
           double v3 = sc.nextDouble();
           media = (v1 * 2 + v2 * 3 + v3 * 5) / 10;
           System.out.printf("Media: %.1f",media);
       }


       }
    }

