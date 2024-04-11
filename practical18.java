package Ariaro;

import java.util.*;


class Person {
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;
    double salary;
    
   
    public Employee(String name, int age, String employeeId, double salary) {
        
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

public class practical18 {
    public static void main(String[] args) {
        
        Person personObj = new Person("John Doe", 25);

        
        Employee employeeObj = new Employee("Jane Smith", 30, "E12345", 50000.0);

        
        System.out.println("Person Object - Name: " + personObj.name);
        System.out.println("Person Object - Age: " + personObj.age);

       
        System.out.println("\nEmployee Object - Name: " + employeeObj.name);
        System.out.println("Employee Object - Age: " + employeeObj.age);
        System.out.println("Employee Object - Employee ID: " + employeeObj.employeeId);
        System.out.println("Employee Object - Salary: " + employeeObj.salary);
    }
}
