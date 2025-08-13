package ex05;

import java.util.Scanner;

/**
 *  escreva um programa que leia o código de um item e a quantidade deste item. A
 * seguir, calcule e mostre o valor da conta a pagar.
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cachorro quente - R$ 4.00");
        System.out.println("2 - X-Salada - R$ 4.50");
        System.out.println("3 - X-Bacon - R$ 5.00");
        System.out.println("4 - Torrada simples - R$ 2.00");
        System.out.println("5 - Refrigerante - R$ 1.50");
        System.out.println("Escolha a opcao:");
        int opcao = sc.nextInt();
        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();
        double total;
        switch (opcao){
            case 1:
                total = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f" , total);
                break;

            case 2:
                total = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f" , total);
                break;

            case 3:
                total = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f" , total);
                break;

            case 4:
                total = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f" , total);
                break;

            case 5:
                total = quantidade* 1.50;
                System.out.printf("Total: R$ %.2f" , total);
                break;
        }

        sc.close();
    }
}
