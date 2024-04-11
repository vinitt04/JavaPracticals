package Ariaro;

import java.util.*;


import java.util.Scanner;


class Adder {
    
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class practical16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        Adder adder = new Adder();

      
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int sum = adder.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        
        scanner.close();
    }
}
