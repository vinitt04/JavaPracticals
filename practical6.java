package Ariaro;

import java.util.*;


import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Choose conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertKilometersToMiles(distance);
                break;
            case 2:
                convertMilesToKilometers(distance);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    private static void convertKilometersToMiles(double kilometers) {
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }

    private static void convertMilesToKilometers(double miles) {
        double kilometers = miles / 0.621371;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
