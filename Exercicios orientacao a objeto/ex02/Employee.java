package ex02;

public class Employee {
    String name;
    double grossSalary;
    double tax;

    public void netSalary(){
        System.out.println("Employee: " + name + "$ " + grossSalary);
    }

    public void increasseSalary(double percentage){
        tax =grossSalary + grossSalary * (percentage / 100);
        System.out.println("Updated data " + tax);
    }
}
