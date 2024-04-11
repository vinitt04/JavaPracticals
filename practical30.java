package Ariaro;

import java.util.*;
public class practical30{
    public static void main(String[] args) {
     
        int intValue = 100;
        Integer integerValue = intValue;
        System.out.println("Autoboxed Integer value: " + integerValue);

        double doubleValue = 25.5;
        Double doubleObject = doubleValue;
        System.out.println("Autoboxed Double value: " + doubleObject);

        
        Integer intValueObj = Integer.valueOf(200);
        int unboxedIntValue = intValueObj; 
        System.out.println("Unboxed int value: " + unboxedIntValue);

        Double doubleValueObj = Double.valueOf(50.75);
        double unboxedDoubleValue = doubleValueObj; 
        System.out.println("Unboxed double value: " + unboxedDoubleValue);
    }
}

    