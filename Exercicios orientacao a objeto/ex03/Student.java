package ex03;

import java.util.Scanner;

public class Student {
    String name;
    double nota1;
    double nota2;
    double nota3;

    public void notaAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        name = sc.nextLine();
        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = sc.nextDouble();
    }

    public void calculoNota(){
        double mediaNota = nota1 + nota2 + nota3 ;
        if (mediaNota > 60){
            System.out.println("Final grade: " + mediaNota);
            System.out.println("Pass");
        }
        else {
            double notaPerdida = 60 - mediaNota;
            System.out.println("Final grade: " + mediaNota);
            System.out.println("Failed!");
            System.out.println("Missing points: " + notaPerdida);
        }
    }
}
