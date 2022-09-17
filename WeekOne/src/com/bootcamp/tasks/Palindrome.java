package com.bootcamp.tasks;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter two word to check if they are plaindrome:-");
        System.out.print("Enter your first Word: ");
        String firstWord = sc.next();
        System.out.print("Enter your second Word: ");
        String secondWord = sc.next();

        if(firstWord.length() == secondWord.length()){
            int length = firstWord.length();
            boolean flag = true;
            for(int i=1; i<=length; i++){
                char c1 = firstWord.charAt(i-1);
                char c2 = secondWord.charAt(length-i);
                if(c1==c2){
                    System.out.println(c1 +" - "+ c2);
                    flag = true;
                }else{
                    flag = false;
                }
            }
            
            if(flag){
                System.out.println("Plaindrome");
            }else{
                System.out.println("Not Palindrome");
            }
            
        }else{
            System.out.println("Length of words is not same");
        }

    }
}
