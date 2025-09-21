package ex04;

import java.util.Scanner;

/**
 Cadastro de números e soma

 Crie um programa que leia 10 números inteiros e armazene em um vetor.

 Crie métodos para:

 Calcular a soma de todos os números.

 Calcular a média.

 Mostrar todos os números maiores que a média.
 */

    public class Program {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("Diga quantas notas deseja informar: ");
            int n = sc.nextInt();
            double [] vect = new double[n];

            for(int i = 0; i < vect.length; i++){
                System.out.println("Digite a " + (i +1) + "° nota: " );
                double value = sc.nextDouble();
                vect[i] = value;

            }
            Entities entities = new Entities();
            double soma = entities.somaValores(vect);
            System.out.println("Soma de todos as notas: " + soma);

            double media = entities.mediaValores(soma, vect);
            System.out.println("Media das notas: " + media);

            entities.acimaDaMedia(media, vect);




            sc.close();
        }
    }
