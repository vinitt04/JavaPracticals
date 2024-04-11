package Ariaro;

import java.util.*;

class CustomException extends Exception {
	 public CustomException(String message) {
	     super(message);
	 }
	}


	class Example {
	 
	 public void performAction(int value) throws CustomException {
	     if (value < 0) {
	         throw new CustomException("Value cannot be negative");
	     } else {
	         System.out.println("Action performed successfully");
	     }
	 }
	}


	public class practical27 {
	 public static void main(String[] args) {
	     Example example = new Example();
	     
	     try {
	         
	         example.performAction(-5);
	     } catch (CustomException e) {
	        
	         System.out.println("Caught CustomException: " + e.getMessage());
	     }
	 }
	}
