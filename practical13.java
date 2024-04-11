
package Ariaro;

import java.util.*;
import java.util.Scanner;

public class practical13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer to display its multiplication table: ");
        int num = scanner.nextInt();

       
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }

        scanner.close();
    }
}
