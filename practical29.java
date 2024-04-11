package Ariaro;

import java.util.*;
public class practical29{
    public static void main(String[] args) {
        
        Thread countThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("count: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        
        countThread.start();

        
        System.out.println("Main thread continues while counting in the background.");
    }
}
