package Ariaro;

import java.util.*;

class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);
 }
}


class MyClass {
 
 public void performTask(int value) throws MyCustomException {
     if (value < 0) {
         throw new MyCustomException("Value cannot be negative");
     } else {
         System.out.println("Task performed successfully");
     }
 }
}
public class practical28{
 public static void main(String[] args) {
     MyClass obj = new MyClass();
     
     try {
         
         obj.performTask(-5);
     } catch (MyCustomException e) {
         
         System.out.println("Custom Exception Caught: " + e.getMessage());
     }
 }
}
