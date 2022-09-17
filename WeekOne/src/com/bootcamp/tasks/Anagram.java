package com.bootcamp.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter two word to check if they are anagram:-");
        System.out.print("Enter your first Word: ");
        String firstWord = sc.next();
        System.out.print("Enter your second Word: ");
        String secondWord = sc.next();
        
        if(firstWord.length() == secondWord.length()) {
          firstWord = firstWord.toLowerCase();
          secondWord = secondWord.toLowerCase();
          char[] w1 = firstWord.toCharArray();
          char[] w2 = secondWord.toCharArray();

          Arrays.sort(w1);
          Arrays.sort(w2);

          boolean result = Arrays.equals(w1, w2);

          if(result){
              System.out.println("Give words are Anagram");
          }else{
              System.out.println("Given words are not Anagram");
          }
        }
        else {
            System.out.println("Length of words is not same");
        }

    }
}
