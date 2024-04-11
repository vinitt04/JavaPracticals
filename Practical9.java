package Ariaro;

import java.util.*;




public class Practical9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first floating-point number: ");
        double number1 = scanner.nextDouble();

        
        System.out.print("Enter the second floating-point number: ");
        double number2 = scanner.nextDouble();

      
        if (areEqual(number1, number2)) {
            System.out.println("The two numbers are the same.");
        } else {
            System.out.println("The two numbers are different.");
        }

        scanner.close();
    }

    private static boolean areEqual(double num1, double num2) {
        
        double epsilon = 1e-10;

        
        return Math.abs(num1 - num2) < epsilon;
    }
}
