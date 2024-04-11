package Ariaro;

import java.util.*;
public class practical33{
    public static void main(String[] args) {
        
        StringBuffer stringBuffer = new StringBuffer("Hello");

     
        stringBuffer.append(" World");
        System.out.println("Appended string: " + stringBuffer);

        
        stringBuffer.insert(6, "Java ");
        System.out.println("Inserted string: " + stringBuffer);

        
        stringBuffer.delete(5, 10);
        System.out.println("Deleted string: " + stringBuffer);

      
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);

     
        stringBuffer.replace(5, 9, "Program");
        System.out.println("Replaced string: " + stringBuffer);
    }
}
