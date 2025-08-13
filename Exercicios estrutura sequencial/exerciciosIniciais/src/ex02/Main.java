package ex02;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Locale;
import java.util.Scanner;

/** Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 casas decimais conforme exemplos.
 Fórmula da área: area = π . raio2
 Considere o valor de π = 3.14159

 */
public class Main {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        double area = pi * (Math.pow(raio, 2));

        System.out.printf("Area: %.4f" , area);

        sc.close();

    }
}
