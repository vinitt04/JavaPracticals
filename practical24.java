package Ariaro;

import java.util.*;
import java.util.Scanner;

public class practical24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
 


