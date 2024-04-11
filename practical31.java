package Ariaro;

import java.util.*;
public class practical31 {
    public static void main(String[] args) {
        
        double num1 = 25.5;
        double num2 = 10.0;

        
        double absValue = Math.abs(num1 - num2);
        System.out.println("Absolute value: " + absValue);

        
        double maxValue = Math.max(num1, num2);
        System.out.println("Maximum value: " + maxValue);

       
        double minValue = Math.min(num1, num2);
        System.out.println("Minimum value: " + minValue);

      
        double powerValue = Math.pow(num1, 2);
        System.out.println("Power value: " + powerValue);

      
        double sqrtValue = Math.sqrt(num1);
        System.out.println("Square root value: " + sqrtValue);
    }
}
