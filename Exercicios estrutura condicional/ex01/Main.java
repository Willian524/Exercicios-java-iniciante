package ex01;

import java.util.Scanner;

/**
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */


public class Main {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if(numero < 0 ){
            System.out.println("Negativo!");
        }
        else{
            System.out.println("Positivo");
        }


        sc.close();
    }
}
