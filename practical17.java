
package Ariaro;

import java.util.*;

class Student {
    
    int studentID;
    String studentName;
    double marksSubject1;
    double marksSubject2;
    double marksSubject3;

  
    void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        studentID = scanner.nextInt();

        System.out.print("Enter Student Name: ");
        studentName = scanner.next();

        System.out.print("Enter Marks for Subject 1: ");
        marksSubject1 = scanner.nextDouble();

        System.out.print("Enter Marks for Subject 2: ");
        marksSubject2 = scanner.nextDouble();

        System.out.print("Enter Marks for Subject 3: ");
        marksSubject3 = scanner.nextDouble();
    }

  
    void displayData() {
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Subject 1: " + marksSubject1);
        System.out.println("Marks for Subject 2: " + marksSubject2);
        System.out.println("Marks for Subject 3: " + marksSubject3);

        double averageMarks = (marksSubject1 + marksSubject2 + marksSubject3) / 3;
        System.out.println("Average Marks: " + averageMarks);
    }
}

public class practical17 {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.displayData();
    }
}
