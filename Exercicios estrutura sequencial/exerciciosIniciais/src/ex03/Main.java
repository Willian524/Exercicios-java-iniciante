package ex03;
/**
 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * */
public class Main {
    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int c = -7;
        int d = 8;

        int diferenca = a * b - c * d;

        System.out.println(diferenca);
    }
}
