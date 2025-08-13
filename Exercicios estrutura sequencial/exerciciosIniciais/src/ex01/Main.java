/**Exercicio 1 -> Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */
package ex01;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        int n1 ;
        int n2 ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextInt();

        

        System.out.printf("Soma  = %d" , n1 + n2);


        sc.close();
    }
}
