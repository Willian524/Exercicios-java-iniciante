package ex01.src.program;

import ex01.src.entities.Rent;

import java.util.Scanner;

/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9.

 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
 * representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10).

 * Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
 * informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.

 * Ao final, seu programa deve imprimir um relatório de todas as ocupações do pensionato, por ordem de quarto, conforme o exemplo
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent [] vect = new Rent[10];

        System.out.println("How many roomswill berented?");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Rent:" + i);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("E - mail: ");
            String email = sc.next();
            sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.println("................");
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }
}