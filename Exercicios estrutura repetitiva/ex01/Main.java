package ex01;

import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */



public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int senha = 0;

        while(senha != 2002){
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
            if(senha != 2002){
                System.out.println("Senha invalida!");
            }
            else {
                System.out.println("Senha correta!");
            }
        }
    }
}
