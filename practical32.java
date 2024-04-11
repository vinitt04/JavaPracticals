package Ariaro;

import java.util.*;
public class practical32 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        
        int length = str1.length();
        System.out.println("Length of str1: " + length);

       
        String concatStr = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatStr);

   
        char charAtIndex = str1.charAt(2);
        System.out.println("Character at index 2 in str1: " + charAtIndex);

       
        String upperCaseStr = str2.toUpperCase();
        System.out.println("Uppercase version of str2: " + upperCaseStr);

        
        String subStr = concatStr.substring(6, 11);
        System.out.println("Substring from index 6 to 10: " + subStr);
    }
}
