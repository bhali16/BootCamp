package com.bootcamp.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        User account = new User(78948937,"Waqar Ahmad Khan", 5000);
        System.out.println("Enter 1-3 for banking operations:");
        System.out.println(" 1: Withdraw \n 2: Show Details \n 3: Deposit");

        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        int opt = sc.nextInt();
        
        switch (opt) {
            case 1:
                withdraw(account);
                break;
            case 2:
                showDetails(account);
                break;
            case 3:
                deposit(account);
        }

    }

    private static int deposit(User account) {
        System.out.print("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        account.accountBalance = account.accountBalance + amount;
        showDetails(account);
        return amount;
    }

    private static void showDetails(User account) {
        System.out.println("Account Details");
        System.out.println("AccountNo: "+ account.accountNo);
        System.out.println("User Name: "+ account.userName);
        System.out.println("Balance: "+ account.accountBalance);
    }

    private static int withdraw(User account) {
        System.out.print("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int withdrawAmount = sc.nextInt();
        account.accountBalance = account.accountBalance - withdrawAmount;
        showDetails(account);
        return withdrawAmount;
    }
}
