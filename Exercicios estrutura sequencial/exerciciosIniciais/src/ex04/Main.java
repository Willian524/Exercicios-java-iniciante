package ex04;

import java.util.Locale;

/**

 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 decimais.

 */


public class Main {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);

        int numFuncionario = 25;
        int horasTrabalhadas = 100;
        double salarioPorHora = 5.50;

        double salarioTotal = horasTrabalhadas * salarioPorHora;

        System.out.println("Numero: " + numFuncionario );
        System.out.println("Salario: R$ " + salarioTotal );

    }
}
