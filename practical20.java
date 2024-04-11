package Ariaro;

import java.util.*;

class Product {
 private int productId;
 private String productName;
 private double price;

 public Product(int productId, String productName, double price) {
     this.productId = productId;
     this.productName = productName;
     this.price = price;
 }

 public void displayDetails() {
     System.out.println("Product ID: " + productId);
     System.out.println("Product Name: " + productName);
     System.out.println("Price: $" + price);
 }
}


class Electronics extends Product {
 private String brand;

 public Electronics(int productId, String productName, double price, String brand) {
     super(productId, productName, price);
     this.brand = brand;
 }


 public void displayDetails() {
     super.displayDetails();
     System.out.println("Brand: " + brand);
 }
}


class Clothing extends Product {
 private String size;

 public Clothing(int productId, String productName, double price, String size) {
     super(productId, productName, price);
     this.size = size;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Size: " + size);
 }
}


class Books extends Product {
 private String author;

 public Books(int productId, String productName, double price, String author) {
     super(productId, productName, price);
     this.author = author;
 }

 
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Author: " + author);
 }
}

public class practical20 {
 public static void main(String[] args) {
     
     Electronics laptop = new Electronics(1, "Laptop", 1200.0, "Dell");
     Clothing shirt = new Clothing(2, "T-Shirt", 25.0, "Medium");
     Books novel = new Books(3, "The Great Gatsby", 15.0, "F. Scott Fitzgerald");

     
     displayProductDetails(laptop);
     System.out.println("\n-----------------\n");
     displayProductDetails(shirt);
     System.out.println("\n-----------------\n");
     displayProductDetails(novel);
 }

 public static void displayProductDetails(Product product) {
     System.out.println("Product Details:");
     product.displayDetails();
 }
}

