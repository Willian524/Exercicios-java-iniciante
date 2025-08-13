package ex03;

import java.util.Scanner;

/**
 *
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
 Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
 ordem crescente ou decrescente.
 */

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();

        if(a % b ==0 || b % a ==0){
            System.out.println("É multiplo!");

        }
        else {
            System.out.println("Nao e multiplo!");
        }

        sc.close();
    }
}
