package ex05;
/**
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Main {
    public static void main(String args[]){
        int peca1 = 12;
        int quantidadePeca1 = 1;
        double valorPeca1 = 5.30;

        int peca2 = 16;
        int quantidadePeca2 = 2;
        double valorPeca2 = 5.10;

        double valorTotal = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;

        System.out.println(valorTotal);
    }
}
