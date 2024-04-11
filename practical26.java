package Ariaro;

import java.util.*;


public class practical26 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 5; 
            int value = numbers[index]; 
            System.out.println("Value at index " + index + ": " + value); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            e.printStackTrace();
        }
    }
}

