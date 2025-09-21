package program;

import employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println(" How many employees will be registered?");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + ":");
            System.out.println("Id:");
            int id = sc.nextInt();

            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Salary:");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));

        }

        System.out.println(" Enter the employee id that will have salary increase :");
        int newId = sc.nextInt();


        boolean result = false;

        for(Employee emp : list){
            if(emp.getId() == newId){
                result = true;
                System.out.println("Enterthe percentage:");
                double percentage = sc.nextDouble();
                emp.aumentoSalarial(percentage);
            }

        }
        if (result == false){
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees:");
        for(Employee employee : list){
            System.out.println(employee);
        }

        sc.close();

    }
}