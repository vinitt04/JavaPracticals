package Ariaro;

import java.util.*;
import java.util.Scanner;

class BankAccount {
 protected double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposit successful. Current balance: $" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful. Current balance: $" + balance);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds.");
     }
 }
}


class SavingsAccount extends BankAccount {
 private static final double WITHDRAWAL_LIMIT = 1000;

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 
 public void withdraw(double amount) {
     if (amount > 0 && amount <= WITHDRAWAL_LIMIT && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal successful from Savings Account. Current balance: $" + balance);
     } else {
         System.out.println("Invalid withdrawal amount, exceeding limit, or insufficient funds.");
     }
 }
}


class CheckingAccount extends BankAccount {
 private static final double WITHDRAWAL_FEE = 1.5;

 public CheckingAccount(double initialBalance) {
     super(initialBalance);
 }

 
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= (amount + WITHDRAWAL_FEE);
         System.out.println("Withdrawal successful from Checking Account. Current balance: $" + balance);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds.");
     }
 }
}

public class practical21{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     SavingsAccount savingsAccount = new SavingsAccount(1000);
     CheckingAccount checkingAccount = new CheckingAccount(1500);

     
     System.out.print("Enter deposit amount for Savings Account: ");
     double savingsDeposit = scanner.nextDouble();
     savingsAccount.deposit(savingsDeposit);

     System.out.print("Enter withdrawal amount for Savings Account: ");
     double savingsWithdrawal = scanner.nextDouble();
     savingsAccount.withdraw(savingsWithdrawal);

     
     System.out.print("\nEnter deposit amount for Checking Account: ");
     double checkingDeposit = scanner.nextDouble();
     checkingAccount.deposit(checkingDeposit);

     System.out.print("Enter withdrawal amount for Checking Account: ");
     double checkingWithdrawal = scanner.nextDouble();
     checkingAccount.withdraw(checkingWithdrawal);

     scanner.close();
 }
}
