package Ariaro;

import java.util.*;



public class Practical10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a single character: ");
        String input = scanner.next();

       
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char character = Character.toLowerCase(input.charAt(0));

            
            if (isVowel(character)) {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("Error: Please enter a valid single character.");
        }

        scanner.close();
    }

    private static boolean isVowel(char ch) {
       
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
