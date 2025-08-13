package ex04;

/**
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
 * X, se for o caso.
 */


public class Main {
    public static void main (String args[]){
        int x = 8;

        for(int i = 0; i < x; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
