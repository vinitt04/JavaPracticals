package Ariaro;

import java.util.*;
import java.util.Scanner;


class Shape {
 
 public double area() {
     return 0.0;
 }

 public double perimeter() {
     return 0.0;
 }
}


class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }


 public double area() {
     return Math.PI * radius * radius;
 }

 
 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}


class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 
 public double area() {
     return length * width;
 }

 
 public double perimeter() {
     return 2 * (length + width);
 }
}


class Triangle extends Shape {
 private double side1;
 private double side2;
 private double side3;

 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 
 public double area() {
     
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 
 public double perimeter() {
     return side1 + side2 + side3;
 }
}

public class practical19 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);
     Triangle triangle = new Triangle(3, 4, 5);

     
     System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());

     System.out.println("\nRectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());

     System.out.println("\nTriangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());

     scanner.close();
 }
}
