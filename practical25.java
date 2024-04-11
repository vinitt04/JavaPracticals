package Ariaro;

import java.util.*;


public class practical25 {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; 
            System.out.println("Result: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            e.printStackTrace();
        }
    }
}
