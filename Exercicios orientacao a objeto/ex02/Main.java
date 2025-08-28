package ex02;

import java.util.Scanner;

/**
 *  Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
 * projetada abaixo.
 */


public class Main {
    public static void main(String args[]){
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome:");
        employee.name = sc.next();
        System.out.println("Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();


        employee.netSalary();
        employee.increasseSalary(employee.tax);



        sc.close();
    }
}
