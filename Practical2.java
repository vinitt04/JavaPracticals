package Ariaro;

import java.util.*;


public class Practical2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first input value:");
		int a= sc.nextInt();
		System.out.print("Enter second input value:");
		int b = sc.nextInt();
		
		int c= a+b;
		
		
		System.out.println("Sum: "+c);
		
		int d= a-b;
		System.out.println("Substraction: "+d);
		
		int e= a*b;
		System.out.println("Multiplication: "+e);
		
		int f= a/b;
		System.out.println("Division: "+f);

	}

}
