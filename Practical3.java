package Ariaro;

import java.util.*;


public class Practical3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first input value:");
		int a= sc.nextInt();
		System.out.println("Enter second input value:");
		int b = sc.nextInt();
		System.out.println("Enter third input value:");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The greatest number is: "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest number is: "+b);
		}
		else if(c>a && c>b) {
			System.out.println("The greatest number is: "+c);
		}
		if(a<b && a<c) {
			System.out.println("The lowest number is: "+a);
		}
		else if(b<a && b<c) {
			System.out.println("The lowest number is: "+b);
		}
		else if(c<a && c<b) {
			System.out.println("The lowest number is: "+c);
		}

	}

}
